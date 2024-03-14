package com.example.MyBank.Dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class OfficeDetailsDto {


    private Long id;
    private String name;
    private String address;
    private String type;
    private String status;

}
