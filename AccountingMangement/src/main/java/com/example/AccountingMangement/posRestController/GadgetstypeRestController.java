package com.example.AccountingMangement.posRestController;

import com.example.AccountingMangement.entity.GadgetType;
import com.example.AccountingMangement.posRepository.GadgetTypeRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/generic")
@CrossOrigin("*")
@RequiredArgsConstructor
public class GadgetstypeRestController {

    private final GadgetTypeRepository genericRepository;

    @GetMapping()
    public List<GadgetType> getAllGeneric() {
        return genericRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<GadgetType> getGenericById(@PathVariable int id) {
        Optional<GadgetType> generic = genericRepository.findById(id);
        return generic.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping()
    public ResponseEntity<GadgetType> createGeneric(@Validated @RequestBody GadgetType generic) {
        GadgetType createdGeneric = genericRepository.save(generic);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdGeneric);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GadgetType> updateGeneric(@PathVariable int id, @Validated @RequestBody GadgetType genericDetails) {
        Optional<GadgetType> optionalGeneric = genericRepository.findById(id);
        if (optionalGeneric.isPresent()) {
            GadgetType generic = optionalGeneric.get();
            generic.setName(genericDetails.getName());
            // Set other fields to update as necessary
            GadgetType updatedGeneric = genericRepository.save(generic);
            return ResponseEntity.ok(updatedGeneric);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGeneric(@PathVariable int id) {
        Optional<GadgetType> generic = genericRepository.findById(id);
        if (generic.isPresent()) {
            genericRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
