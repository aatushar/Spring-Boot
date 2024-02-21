package com.example.AccountingMangement.posRestController;

import com.example.AccountingMangement.entity.Sales;
import com.example.AccountingMangement.posRepository.IStockRepository;
import com.example.AccountingMangement.posRepository.PurchaseGadgetsRepository;
import com.example.AccountingMangement.posRepository.SalesRepository;
import com.example.AccountingMangement.posService.SaleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sales")
@CrossOrigin("*")
public class SalesRestController {
    @Autowired
    private SaleService saleService;
    @Autowired
    private SalesRepository salesRepository;

    @Autowired
    private IStockRepository stockRepository;

    @Autowired
    PurchaseGadgetsRepository medicineRepository;



    @GetMapping()
    public Optional<List<Sales>> getAllSales(){

        return Optional.of(salesRepository.findAll());
    }


    @PostMapping
    public ResponseEntity<Sales> addSale(@RequestBody Sales sale) {
        Sales newSale = saleService.addSale(sale);
        return new ResponseEntity<>(newSale, HttpStatus.CREATED);
    }



}
