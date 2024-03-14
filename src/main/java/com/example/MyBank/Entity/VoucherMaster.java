package com.example.MyBank.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class VoucherMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long officeId;
    private String amount;
    private String remark;
    private String officeType;
    private LocalDate date;

    @OneToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<VoucherDetails> voucherDetails;


}
