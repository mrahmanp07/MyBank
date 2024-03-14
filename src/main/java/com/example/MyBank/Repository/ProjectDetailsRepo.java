package com.example.MyBank.Repository;

import com.example.MyBank.Entity.ProjectCoaMapping;
import com.example.MyBank.Entity.ProjectDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectDetailsRepo extends JpaRepository<ProjectDetails, Long> {
}
