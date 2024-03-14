package com.example.MyBank.Repository;

import com.example.MyBank.Entity.ProjectDetails;
import com.example.MyBank.Entity.VoucherDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoucherDetailsRepo extends JpaRepository<VoucherDetails, Long> {
}
