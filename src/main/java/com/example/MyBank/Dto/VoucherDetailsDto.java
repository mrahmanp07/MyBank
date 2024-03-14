package com.example.MyBank.Dto;

import java.time.LocalDate;

public class VoucherDetailsDto {

    private Long id;

    private Long officeId;
    private Long projectId;
    private Long toCoaId;
    private Long fromCoaId;
    private Float debit;
    private Float credit;
    private String particular;
    private LocalDate date;
    private Long masterVoucherId;

}
