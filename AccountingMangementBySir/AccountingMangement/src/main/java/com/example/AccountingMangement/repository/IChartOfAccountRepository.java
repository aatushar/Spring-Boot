package com.example.AccountingMangement.repository;


import com.example.AccountingMangement.model.ChartOfAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IChartOfAccountRepository extends JpaRepository<ChartOfAccount,Long> {

}
