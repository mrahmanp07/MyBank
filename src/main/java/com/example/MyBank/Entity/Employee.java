package com.example.MyBank.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 6, max = 25)
    private String name;

    private String designation;
    private String address;

    @NotBlank
    @Email
    private String mail;

    @NotBlank
    private String phone;

    private boolean active = true;
    private boolean deleted = false;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private Integer createdBy;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    private Integer updatedBy;




}
