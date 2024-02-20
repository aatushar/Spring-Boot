package com.example.AccountingMangement.controller;

import com.example.AccountingMangement.model.Item;
import com.example.AccountingMangement.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemApiController {

    @Autowired
    private ItemService service;

    @GetMapping("/")
    public ResponseEntity<List<Item>> getAllItems() {
        List<Item> itemList = service.getAllItem();
        return new ResponseEntity<>(itemList, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addItem(@RequestBody Item item) {
        service.save(item);

        return  ResponseEntity.ok ("Data inserted");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteItem(@PathVariable int id) {
        service.deleteItem(id);
        return  ResponseEntity.ok ("Data deleted");
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<String> editItem(@PathVariable int id, @RequestBody Item updatedItem) {
        Item item = service.editItem(id);
        if (item != null) {
            updatedItem.setId(id);
            service.save(updatedItem);

            return  ResponseEntity.ok ("Data updated");
        } else {

            return  ResponseEntity.ok ("Data not found");
        }
    }
}
