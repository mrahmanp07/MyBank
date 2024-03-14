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
public class ProjectCoaMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank
    @Size(min = 2, max = 25)
    private String name;
    private String mapId;

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "id",nullable = true)
    private ProjectDetails projectDetails;


    @ManyToOne
    @JoinColumn(name = "coa_id", referencedColumnName = "id",nullable = true)
    private ChartOfAccounts chartOfAccounts;

}
