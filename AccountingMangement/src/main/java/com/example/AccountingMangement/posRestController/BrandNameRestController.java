package com.example.AccountingMangement.posRestController;

import com.example.AccountingMangement.entity.BrandName;
import com.example.AccountingMangement.posRepository.BrandNameRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/manufacturer")
@CrossOrigin("*")
@RequiredArgsConstructor
public class BrandNameRestController {

    private final BrandNameRepository manufacturerRepository;

    @GetMapping()
    public List<BrandName> getAllManufacturer() {
        return manufacturerRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BrandName> getManufacturerById(@PathVariable("id") int id) {
        Optional<BrandName> manufacturerOptional = manufacturerRepository.findById(id);
        return manufacturerOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping()
    public ResponseEntity<BrandName> createManufacturer(@RequestBody BrandName manufacturer) {
        BrandName createdManufacturer = manufacturerRepository.save(manufacturer);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdManufacturer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BrandName> updateManufacturer(@PathVariable("id") int id, @RequestBody BrandName updatedManufacturer) {
        Optional<BrandName> existingManufacturerOptional = manufacturerRepository.findById(id);
        if (existingManufacturerOptional.isPresent()) {
            BrandName existingManufacturer = existingManufacturerOptional.get();
            existingManufacturer.setName(updatedManufacturer.getName());
            // You can update other fields as needed
            BrandName savedManufacturer = manufacturerRepository.save(existingManufacturer);
            return ResponseEntity.ok(savedManufacturer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteManufacturer(@PathVariable("id") int id) {
        Optional<BrandName> manufacturerOptional = manufacturerRepository.findById(id);
        if (manufacturerOptional.isPresent()) {
            manufacturerRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
