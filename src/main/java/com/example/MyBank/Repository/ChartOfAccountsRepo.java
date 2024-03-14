package com.example.MyBank.Repository;

import com.example.MyBank.Entity.ChartOfAccounts;
import com.example.MyBank.Entity.CoaElements;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChartOfAccountsRepo extends JpaRepository<ChartOfAccounts, Long> {
}
