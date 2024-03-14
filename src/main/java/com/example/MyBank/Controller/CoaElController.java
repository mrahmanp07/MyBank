package com.example.MyBank.Controller;

import com.example.MyBank.Entity.CoaElements;
import com.example.MyBank.Entity.Employee;
import com.example.MyBank.Services.CoaElService;
import com.example.MyBank.Services.EmployeeService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/coael", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class CoaElController {

    @Autowired
    private CoaElService coaElService;



    @GetMapping("/getAll")
    public ResponseEntity<?> getAllCoaEl(){
        return ResponseEntity.ok(coaElService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCoaEl(@PathVariable("id") Long id) {
        return ResponseEntity.ok(coaElService.getById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveCoaEl(@RequestBody CoaElements coaElements){
        return ResponseEntity.ok(coaElService.addCoaEl(coaElements));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        coaElService.delete(id);
//        return ResponseEntity.ok("Success!!");

    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody CoaElements coaElements) {

        return ResponseEntity.ok(coaElService.update(id, coaElements));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(){
        return null;
    }






}
