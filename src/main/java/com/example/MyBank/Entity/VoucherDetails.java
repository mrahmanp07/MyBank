package com.example.MyBank.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class VoucherDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "office_id", referencedColumnName = "id",nullable = true)
    private OfficeDetails officeDetails;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id",nullable = true)
    private CustomerDetails customerDetails;



    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "id",nullable = true)
    private ProjectDetails projectDetails;



    @ManyToOne
    @JoinColumn(name = "to_coa_id", referencedColumnName = "id",nullable = true)
    private ChartOfAccounts toChartOfAccounts;

    @ManyToOne
    @JoinColumn(name = "from_coa_id", referencedColumnName = "id",nullable = true)
    private ChartOfAccounts fromChartOfAccounts;



    private Float amount;
    private Float type;
    private String particular;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "master_voucher_id", referencedColumnName = "id",nullable = true)
    private VoucherMaster voucherMaster;





}
