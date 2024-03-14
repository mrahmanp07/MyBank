package com.example.MyBank.Controller;

import com.example.MyBank.Dto.EmployeeDto;
import com.example.MyBank.Entity.Employee;
import com.example.MyBank.Services.EmployeeService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/emp", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllEmployee(){
    return ResponseEntity.ok(employeeService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEmployee(@PathVariable("id") Long id) {
        return ResponseEntity.ok(employeeService.getById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.addEmployee(employee));
    }

    @DeleteMapping("/{id}")
    @ApiResponse(responseCode = "204")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        employeeService.delete(id);
        return ResponseEntity.ok("Success!!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                           @RequestBody Employee employee) {

        return ResponseEntity.ok(employeeService.update(id, employee));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(){
        return null;
    }



}
