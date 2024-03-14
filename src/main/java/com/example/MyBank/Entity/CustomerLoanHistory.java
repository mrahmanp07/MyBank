package com.example.MyBank.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class CustomerLoanHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 25)
    private String type;
    private double amount;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    private Long LoanTerm;


    @ManyToOne
    @JoinColumn(name = "customer_info_id", referencedColumnName = "id",nullable = true)
    private CustomerDetails customerDetails;

    @ManyToOne
    @JoinColumn(name = "project_details_id", referencedColumnName = "id",nullable = true)
    private ProjectDetails projectDetails;

    private Double RemainingAmount;
    private Double Installments;

}
