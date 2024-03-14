package com.example.MyBank.Controller;

import com.example.MyBank.Entity.ProjectDetails;
import com.example.MyBank.Entity.VoucherDetails;
import com.example.MyBank.Services.ProjectDetailsService;
import com.example.MyBank.Services.VoucherDetailsService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/voucherdetails", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class VoucherDetailsController {

    @Autowired
    private VoucherDetailsService voucherDetailsService;



    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(voucherDetailsService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(voucherDetailsService.getById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody VoucherDetails voucherDetails){
        return ResponseEntity.ok(voucherDetailsService.add(voucherDetails));
    }

    @DeleteMapping("/{id}")
    @ApiResponse(responseCode = "204")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        voucherDetailsService.delete(id);
        return ResponseEntity.ok("Success!!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody VoucherDetails voucherDetails) {

        return ResponseEntity.ok(voucherDetailsService.update(id, voucherDetails));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(){
        return null;
    }



}
