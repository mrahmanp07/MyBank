package com.example.MyBank.Repository;


import com.example.MyBank.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
  }
