package com.example.MyBank.Services;

import com.example.MyBank.Entity.ProjectCoaMapping;
import com.example.MyBank.Entity.ProjectDetails;
import com.example.MyBank.Repository.PcmRepo;
import com.example.MyBank.Repository.ProjectDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectDetailsService {

    @Autowired
    private ProjectDetailsRepo projectDetailsRepo;



    public ProjectDetails add(ProjectDetails projectDetails) {
        return projectDetailsRepo.save(projectDetails);
    }


    public List<ProjectDetails> getAll(){
        List<ProjectDetails> projectDetails = projectDetailsRepo.findAll();
        return projectDetails;
    }


    public ProjectDetails getById(Long id){
        return projectDetailsRepo.findById(id).get();

    }

    public ProjectDetails update(Long id, ProjectDetails projectDetails){
        projectDetails.setId(id);
        return projectDetailsRepo.save(projectDetails);

    }

    public void delete(Long id){
        projectDetailsRepo.deleteById(id);
    }


}
