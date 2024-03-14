package com.example.MyBank.Controller;

import com.example.MyBank.Entity.ChartOfAccounts;
import com.example.MyBank.Entity.CoaElements;
import com.example.MyBank.Services.ChartOfAccountsService;
import com.example.MyBank.Services.CoaElService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/coa", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class ChartOfAccountsController {

    @Autowired
    private ChartOfAccountsService chartOfAccountsService;



    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(chartOfAccountsService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(chartOfAccountsService.getById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody ChartOfAccounts chartOfAccounts){
        return ResponseEntity.ok(chartOfAccountsService.addChartOfAccounts(chartOfAccounts));
    }

    @DeleteMapping("/{id}")
    @ApiResponse(responseCode = "204")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        chartOfAccountsService.delete(id);
        return ResponseEntity.ok("Success!!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody ChartOfAccounts chartOfAccounts) {

        return ResponseEntity.ok(chartOfAccountsService.update(id, chartOfAccounts));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(){
        return null;
    }


}
