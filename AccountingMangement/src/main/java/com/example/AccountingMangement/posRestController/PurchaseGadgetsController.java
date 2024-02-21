package com.example.AccountingMangement.posRestController;


import com.example.AccountingMangement.entity.BrandName;
import com.example.AccountingMangement.entity.GadgetType;
import com.example.AccountingMangement.entity.PurchaseGadgets;
import com.example.AccountingMangement.posRepository.BrandNameRepository;
import com.example.AccountingMangement.posRepository.GadgetTypeRepository;
import com.example.AccountingMangement.posRepository.IStockRepository;
import com.example.AccountingMangement.posRepository.PurchaseGadgetsRepository;
import com.example.AccountingMangement.posService.PurchaseGadgetsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medicine")
@CrossOrigin("*")
public class PurchaseGadgetsController {

    @Autowired
    PurchaseGadgetsRepository medicineRepository;
    @Autowired
    private GadgetTypeRepository genericRepository;
    @Autowired
    private BrandNameRepository manufacturerRepository;
    @Autowired
    private IStockRepository stockRepository;

    @Autowired
    private PurchaseGadgetsService medicineService;



    @GetMapping()
    public Optional<List<PurchaseGadgets>> getAllProduct(){

        return Optional.of(medicineRepository.findAll());
    }


    @PostMapping
    public ResponseEntity<PurchaseGadgets> addMedicine(@RequestBody PurchaseGadgets medicine ){
        String genericName=medicine.getGeneric().getName();
        String manufacturerName=medicine.getManufacturer().getName();
        GadgetType generic=genericRepository.findByName(genericName);
        BrandName manufacturer=manufacturerRepository.findByName(manufacturerName);
        medicine.setGeneric(generic);
        medicine.setManufacturer(manufacturer);
        PurchaseGadgets saveMedicine=medicineRepository.save(medicine);
        medicineService.updateStock(medicine);
        return  ResponseEntity.ok(saveMedicine);

    }


}
