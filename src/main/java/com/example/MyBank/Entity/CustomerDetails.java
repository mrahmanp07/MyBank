package com.example.MyBank.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class CustomerDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<CustomerLoanHistory> customerLoanHistory;

    @NotBlank
    @Size(min = 2, max = 25)
    private String name;
    private Long age;
    private String gender;
    private String phoneNumber;
    private String mail;
    private String nidNumber;
    private String civilStatus;
    private String occupation;
    private String address;
    private String customerFullDetails;
    private String type;
    private String status;
    @ManyToOne
    @JoinColumn(name = "reg_office-id", referencedColumnName = "id",nullable = true)
    private OfficeDetails officeDetails;

}
