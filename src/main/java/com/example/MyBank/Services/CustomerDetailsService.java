package com.example.MyBank.Services;

import com.example.MyBank.Entity.CustomerDetails;
import com.example.MyBank.Entity.ProjectDetails;
import com.example.MyBank.Repository.CustomerDetailsRepo;
import com.example.MyBank.Repository.ProjectDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDetailsService {

    @Autowired
    private CustomerDetailsRepo customerDetailsRepo;



    public CustomerDetails add(CustomerDetails customerDetails) {
        return customerDetailsRepo.save(customerDetails);
    }


    public List<CustomerDetails> getAll(){
        List<CustomerDetails> customerDetails = customerDetailsRepo.findAll();
        return customerDetails;
    }


    public CustomerDetails getById(Long id){
        return customerDetailsRepo.findById(id).get();

    }

    public CustomerDetails update(Long id, CustomerDetails customerDetails){
        customerDetails.setId(id);
        return customerDetailsRepo.save(customerDetails);

    }

    public void delete(Long id){
        customerDetailsRepo.deleteById(id);
    }
}
