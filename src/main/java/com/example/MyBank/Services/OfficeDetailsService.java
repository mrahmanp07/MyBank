package com.example.MyBank.Services;

import com.example.MyBank.Entity.OfficeDetails;
import com.example.MyBank.Entity.OfficeProjectMapping;
import com.example.MyBank.Repository.OfficeDetailsRepo;
import com.example.MyBank.Repository.OfficeProjectMappingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfficeDetailsService {

    @Autowired
    private OfficeDetailsRepo officeDetailsRepo;



    public OfficeDetails add(OfficeDetails officeDetails) {
        return officeDetailsRepo.save(officeDetails);
    }


    public List<OfficeDetails> getAll(){
        List<OfficeDetails> officeDetails = officeDetailsRepo.findAll();
        return officeDetails;
    }


    public OfficeDetails getById(Long id){
        return officeDetailsRepo.findById(id).get();

    }

    public OfficeDetails update(Long id, OfficeDetails officeDetails){
        officeDetails.setId(id);
        return officeDetailsRepo.save(officeDetails);

    }

    public void delete(Long id){
        officeDetailsRepo.deleteById(id);
    }


}
