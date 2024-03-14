package com.example.MyBank.Services;

import com.example.MyBank.Dto.EmployeeDto;
import com.example.MyBank.Entity.Employee;
import com.example.MyBank.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;



    public Employee addEmployee(Employee employee) {
//        Employee employee = new Employee();
//
//        employee.setName(employeeDto.getName());
//        employee.setDesignation(employeeDto.getDesignation());
//        employee.setAddress(employeeDto.getAddress());
//        employee.setMail(employeeDto.getMail());
//        employee.setPhone(employeeDto.getPhone());

        return employeeRepo.save(employee);
    }


    public List<Employee> getAll(){
        List<Employee> employee = employeeRepo.findAll();
        return employee;
    }


    public Employee getById(Long id){
        return employeeRepo.findById(id).get();

    }

    public Employee update(Long id, Employee employee){
        employee.setId(id);
        return employeeRepo.save(employee);

    }

    public void delete(Long id){
         employeeRepo.deleteById(id);
    }



//    private Employee mapToEntity(final EmployeeDto employeeDto, final Employee employee) {
//        employee.setName(employeeDto.getName());
//        employee.setDesignation(employeeDto.getDesignation());
//        employee.setAddress(employeeDto.getAddress());
//        employee.setMail(employeeDto.getMail());
//        employee.setPhone(employeeDto.getPhone());
//
//        return employee;
//
//
//    }

}
