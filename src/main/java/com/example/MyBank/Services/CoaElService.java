package com.example.MyBank.Services;

import com.example.MyBank.Entity.CoaElements;
import com.example.MyBank.Entity.Employee;
import com.example.MyBank.Repository.CoaElRepo;
import com.example.MyBank.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoaElService {

    @Autowired
    private CoaElRepo coaElRepo;



    public CoaElements addCoaEl(CoaElements coaElements) {
//        Employee employee = new Employee();
//
//        employee.setName(employeeDto.getName());
//        employee.setDesignation(employeeDto.getDesignation());
//        employee.setAddress(employeeDto.getAddress());
//        employee.setMail(employeeDto.getMail());
//        employee.setPhone(employeeDto.getPhone());

        return coaElRepo.save(coaElements);
    }


    public List<CoaElements> getAll(){
        List<CoaElements> coaElements = coaElRepo.findAll();
        return coaElements;
    }


    public CoaElements getById(Long id){
        return coaElRepo.findById(id).get();

    }

    public CoaElements update(Long id, CoaElements coaElements){
        coaElements.setId(id);
        return coaElRepo.save(coaElements);

    }

    public void delete(Long id){
        coaElRepo.deleteById(id);
    }

}
