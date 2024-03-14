package com.example.MyBank.Services;

import com.example.MyBank.Entity.ChartOfAccounts;
import com.example.MyBank.Entity.CoaElements;
import com.example.MyBank.Repository.ChartOfAccountsRepo;
import com.example.MyBank.Repository.CoaElRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChartOfAccountsService {

    @Autowired
    private ChartOfAccountsRepo chartOfAccountsRepo;



    public ChartOfAccounts addChartOfAccounts(ChartOfAccounts chartOfAccounts) {
        return chartOfAccountsRepo.save(chartOfAccounts);
    }


    public List<ChartOfAccounts> getAll(){
        List<ChartOfAccounts> chartOfAccounts = chartOfAccountsRepo.findAll();
        return chartOfAccounts;
    }


    public ChartOfAccounts getById(Long id){
        return chartOfAccountsRepo.findById(id).get();

    }

    public ChartOfAccounts update(Long id, ChartOfAccounts chartOfAccounts){
        chartOfAccounts.setId(id);
        return chartOfAccountsRepo.save(chartOfAccounts);

    }

    public void delete(Long id){
        chartOfAccountsRepo.deleteById(id);
    }


}
