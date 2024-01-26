package com.example.AccountingMangement.service;

import com.example.AccountingMangement.model.Item;
import com.example.AccountingMangement.repository.IItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ItemService {
    @Autowired
    private IItemRepo repo;

    public void save(Item i){
        repo.save(i);

    }
    public List<Item> getAllItem(){
        return repo.findAll();
    }

    public void deleteItem(int id){
        repo.deleteById(id);

    }

    public Item editItem(int id){
       return repo.findById(id).get();
    }
}
