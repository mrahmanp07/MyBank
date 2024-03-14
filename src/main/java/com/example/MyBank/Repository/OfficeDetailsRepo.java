package com.example.MyBank.Repository;

import com.example.MyBank.Entity.OfficeDetails;
import com.example.MyBank.Entity.OfficeProjectMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeDetailsRepo extends JpaRepository<OfficeDetails, Long> {
}
