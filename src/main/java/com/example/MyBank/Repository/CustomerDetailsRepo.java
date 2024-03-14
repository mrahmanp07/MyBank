package com.example.MyBank.Repository;

import com.example.MyBank.Entity.CustomerDetails;
import com.example.MyBank.Entity.ProjectDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailsRepo extends JpaRepository<CustomerDetails, Long> {
}
