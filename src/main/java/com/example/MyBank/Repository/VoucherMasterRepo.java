package com.example.MyBank.Repository;

import com.example.MyBank.Entity.VoucherDetails;
import com.example.MyBank.Entity.VoucherMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoucherMasterRepo extends JpaRepository<VoucherMaster, Long> {
}
