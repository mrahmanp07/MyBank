package com.example.MyBank.Controller;

import com.example.MyBank.Entity.ProjectCoaMapping;
import com.example.MyBank.Entity.VoucherMaster;
import com.example.MyBank.Services.PcmService;
import com.example.MyBank.Services.VoucherMasterService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/vouchermaster", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class VoucherMasterController {

    @Autowired
    private VoucherMasterService voucherMasterService;



    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(voucherMasterService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(voucherMasterService.getById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody VoucherMaster voucherMaster){
        return ResponseEntity.ok(voucherMasterService.add(voucherMaster));
    }

    @DeleteMapping("/{id}")
    @ApiResponse(responseCode = "204")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        voucherMasterService.delete(id);
        return ResponseEntity.ok("Success!!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody VoucherMaster voucherMaster) {

        return ResponseEntity.ok(voucherMasterService.update(id, voucherMaster));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(){
        return null;
    }



}
