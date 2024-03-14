package com.example.MyBank.Dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CustomerLoanHistoryDto {


    private Long id;

    private String type;
    private String amount;
    private String startDate;
    private String endDate;
    private String status;
    private Long customerInfo;

}
