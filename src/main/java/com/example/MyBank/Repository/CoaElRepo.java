package com.example.MyBank.Repository;

import com.example.MyBank.Entity.CoaElements;
import com.example.MyBank.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoaElRepo extends JpaRepository<CoaElements, Long> {
}
