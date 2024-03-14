package com.example.MyBank.Repository;

import com.example.MyBank.Entity.CustomerDetails;
import com.example.MyBank.Entity.CustomerLoanHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerLoanHistoryRepo extends JpaRepository<CustomerLoanHistory, Long> {
}
