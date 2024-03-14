package com.example.MyBank.Controller;

import com.example.MyBank.Entity.OfficeDetails;
import com.example.MyBank.Entity.OfficeProjectMapping;
import com.example.MyBank.Services.OfficeDetailsService;
import com.example.MyBank.Services.OfficeProjectMappingService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/officeDetails", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class OfficeDetailsController {

    @Autowired
    private OfficeDetailsService officeDetailsService;



    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(officeDetailsService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(officeDetailsService.getById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody OfficeDetails officeDetails){
        return ResponseEntity.ok(officeDetailsService.add(officeDetails));
    }

    @DeleteMapping("/{id}")
    @ApiResponse(responseCode = "204")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        officeDetailsService.delete(id);
        return ResponseEntity.ok("Success!!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody OfficeDetails officeDetails) {

        return ResponseEntity.ok(officeDetailsService.update(id, officeDetails));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(){
        return null;
    }


}
