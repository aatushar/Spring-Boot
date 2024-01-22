package com.example.AccountingMangement.repository;


import com.example.AccountingMangement.model.Chart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChartRepo extends JpaRepository<Chart ,Integer> {

}
