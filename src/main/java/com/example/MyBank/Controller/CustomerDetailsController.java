package com.example.MyBank.Controller;

import com.example.MyBank.Entity.CustomerDetails;
import com.example.MyBank.Entity.ProjectDetails;
import com.example.MyBank.Services.CustomerDetailsService;
import com.example.MyBank.Services.ProjectDetailsService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customerdetails", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class CustomerDetailsController {

    @Autowired
    private CustomerDetailsService customerDetailsService;



    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(customerDetailsService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(customerDetailsService.getById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody CustomerDetails customerDetails){
        return ResponseEntity.ok(customerDetailsService.add(customerDetails));
    }

    @DeleteMapping("/{id}")
    @ApiResponse(responseCode = "204")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        customerDetailsService.delete(id);
        return ResponseEntity.ok("Success!!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody CustomerDetails customerDetails) {

        return ResponseEntity.ok(customerDetailsService.update(id, customerDetails));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(){
        return null;
    }



}
