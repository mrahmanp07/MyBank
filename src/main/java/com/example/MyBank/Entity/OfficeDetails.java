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
public class OfficeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<OfficeProjectMapping> officeProjectMapping;

    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<CustomerDetails> customerDetails;

    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<VoucherDetails> voucherDetails;

    @NotBlank
    @Size(min = 2, max = 25)
    private String name;
    private String address;
    private String type;
    private String status;

}
