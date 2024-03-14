package com.example.MyBank.Services;

import com.example.MyBank.Entity.CustomerDetails;
import com.example.MyBank.Entity.CustomerLoanHistory;
import com.example.MyBank.Repository.CustomerDetailsRepo;
import com.example.MyBank.Repository.CustomerLoanHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CustomerLoanHistoryService {

    @Autowired
    private CustomerLoanHistoryRepo customerLoanHistoryRepo;




    public LocalDate toEndDate(LocalDate Date, Long term) {
        return Date.plusMonths(term);
    }

    public CustomerLoanHistory add(CustomerLoanHistory customerLoanHistory) {
        return customerLoanHistoryRepo.save(customerLoanHistory);
    }


    public List<CustomerLoanHistory> getAll(){
        List<CustomerLoanHistory> customerLoanHistory = customerLoanHistoryRepo.findAll();
        return customerLoanHistory;
    }


    public CustomerLoanHistory getById(Long id){
        return customerLoanHistoryRepo.findById(id).get();

    }

    public CustomerLoanHistory update(Long id, CustomerLoanHistory customerLoanHistory){
        customerLoanHistory.setId(id);
        return customerLoanHistoryRepo.save(customerLoanHistory);

    }

    public void delete(Long id){
        customerLoanHistoryRepo.deleteById(id);
    }
}
