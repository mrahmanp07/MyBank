package com.example.MyBank.Repository;

import com.example.MyBank.Entity.OfficeProjectMapping;
import com.example.MyBank.Entity.ProjectCoaMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeProjectMappingRepo extends JpaRepository<OfficeProjectMapping, Long> {
}
