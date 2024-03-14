package com.example.MyBank.Controller;

import com.example.MyBank.Entity.CustomerDetails;
import com.example.MyBank.Entity.CustomerLoanHistory;
import com.example.MyBank.Services.CustomerDetailsService;
import com.example.MyBank.Services.CustomerLoanHistoryService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/clh", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class CustomerLoanHistoryController {

    @Autowired
    private CustomerLoanHistoryService customerLoanHistoryService;



    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(customerLoanHistoryService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(customerLoanHistoryService.getById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody CustomerLoanHistory customerLoanHistory){
        return ResponseEntity.ok(customerLoanHistoryService.add(customerLoanHistory));
    }

    @DeleteMapping("/{id}")
    @ApiResponse(responseCode = "204")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        customerLoanHistoryService.delete(id);
        return ResponseEntity.ok("Success!!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody CustomerLoanHistory customerLoanHistory) {

        return ResponseEntity.ok(customerLoanHistoryService.update(id, customerLoanHistory));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(){
        return null;
    }




}
