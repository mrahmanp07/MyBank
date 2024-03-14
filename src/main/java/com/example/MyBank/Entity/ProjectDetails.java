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
public class ProjectDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 25)
    private String name;
    private String projectId;
    private String projectAims;
    private Long amount;
    private Long interestRate;
    private String status;

    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<ProjectCoaMapping> projectCoaMapping;

    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<OfficeProjectMapping> officeProjectMapping;

    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<VoucherDetails> voucherDetails;

    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<CustomerLoanHistory> customerLoanHistory;

}
