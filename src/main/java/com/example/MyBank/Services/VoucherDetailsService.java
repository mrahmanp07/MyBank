package com.example.MyBank.Services;

import com.example.MyBank.Entity.ProjectDetails;
import com.example.MyBank.Entity.VoucherDetails;
import com.example.MyBank.Repository.ProjectDetailsRepo;
import com.example.MyBank.Repository.VoucherDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoucherDetailsService {

    @Autowired
    private VoucherDetailsRepo voucherDetailsRepo;



    public VoucherDetails add(VoucherDetails voucherDetails) {
        return voucherDetailsRepo.save(voucherDetails);
    }


    public List<VoucherDetails> getAll(){
        List<VoucherDetails> voucherDetails = voucherDetailsRepo.findAll();
        return voucherDetails;
    }


    public VoucherDetails getById(Long id){
        return voucherDetailsRepo.findById(id).get();

    }

    public VoucherDetails update(Long id, VoucherDetails voucherDetails){
        voucherDetails.setId(id);
        return voucherDetailsRepo.save(voucherDetails);

    }

    public void delete(Long id){
        voucherDetailsRepo.deleteById(id);
    }


}
