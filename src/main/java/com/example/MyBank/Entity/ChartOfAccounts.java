package com.example.MyBank.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class ChartOfAccounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 25)
    private String name;
    private String coaId;
    private String type;
    private String amount;
    private String status;
    @ManyToOne
    @JoinColumn(name = "coa_elements_id", referencedColumnName = "id",nullable = true)
    private CoaElements coaElements;

    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<VoucherDetails> voucherDetails;

    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<ProjectCoaMapping> projectCoaMapping;



}
