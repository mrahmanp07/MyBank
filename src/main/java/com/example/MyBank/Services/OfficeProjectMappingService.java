package com.example.MyBank.Services;

import com.example.MyBank.Entity.OfficeProjectMapping;
import com.example.MyBank.Entity.ProjectCoaMapping;
import com.example.MyBank.Repository.OfficeProjectMappingRepo;
import com.example.MyBank.Repository.PcmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeProjectMappingService {

    @Autowired
    private OfficeProjectMappingRepo officeProjectMappingRepo;



    public OfficeProjectMapping add(OfficeProjectMapping officeProjectMapping) {
        return officeProjectMappingRepo.save(officeProjectMapping);
    }


    public List<OfficeProjectMapping> getAll(){
        List<OfficeProjectMapping> officeProjectMapping = officeProjectMappingRepo.findAll();
        return officeProjectMapping;
    }


    public OfficeProjectMapping getById(Long id){
        return officeProjectMappingRepo.findById(id).get();

    }

    public OfficeProjectMapping update(Long id, OfficeProjectMapping officeProjectMapping){
        officeProjectMapping.setId(id);
        return officeProjectMappingRepo.save(officeProjectMapping);

    }

    public void delete(Long id){
        officeProjectMappingRepo.deleteById(id);
    }


}
