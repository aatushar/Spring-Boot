package com.example.AccountingMangement.posRepository;

import com.example.AccountingMangement.entity.GadgetType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GadgetTypeRepository extends JpaRepository <GadgetType,Integer> {

    GadgetType findByName(String name);

}
