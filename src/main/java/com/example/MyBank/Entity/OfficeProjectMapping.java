package com.example.MyBank.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class OfficeProjectMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 25)
    private String officeMapName;
    private String officeMapId;
    private String status;
    @ManyToOne
    @JoinColumn(name = "office_id", referencedColumnName = "id",nullable = true)
    private OfficeDetails officeDetails;


    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "id",nullable = true)
    private ProjectDetails projectDetails;



}
