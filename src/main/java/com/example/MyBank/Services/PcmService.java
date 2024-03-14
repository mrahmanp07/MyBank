package com.example.MyBank.Services;

import com.example.MyBank.Entity.ChartOfAccounts;
import com.example.MyBank.Entity.ProjectCoaMapping;
import com.example.MyBank.Repository.ChartOfAccountsRepo;
import com.example.MyBank.Repository.PcmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcmService {

    @Autowired
    private PcmRepo pcmRepo;



    public ProjectCoaMapping add(ProjectCoaMapping projectCoaMapping) {
        return pcmRepo.save(projectCoaMapping);
    }


    public List<ProjectCoaMapping> getAll(){
        List<ProjectCoaMapping> projectCoaMapping = pcmRepo.findAll();
        return projectCoaMapping;
    }


    public ProjectCoaMapping getById(Long id){
        return pcmRepo.findById(id).get();

    }

    public ProjectCoaMapping update(Long id, ProjectCoaMapping projectCoaMapping){
        projectCoaMapping.setId(id);
        return pcmRepo.save(projectCoaMapping);

    }

    public void delete(Long id){
        pcmRepo.deleteById(id);
    }


}
