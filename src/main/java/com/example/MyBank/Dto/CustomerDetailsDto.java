package com.example.MyBank.Dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CustomerDetailsDto {


    private Long id;
    private String name;
    private String address;
    private String customerFullDetails;
    private String type;
    private String status;
    private Long regOfficeId;

}
