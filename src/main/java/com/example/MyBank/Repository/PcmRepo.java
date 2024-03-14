package com.example.MyBank.Repository;

import com.example.MyBank.Entity.Employee;
import com.example.MyBank.Entity.ProjectCoaMapping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PcmRepo extends JpaRepository<ProjectCoaMapping, Long> {
}
