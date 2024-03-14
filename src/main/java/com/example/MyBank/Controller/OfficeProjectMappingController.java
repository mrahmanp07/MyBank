package com.example.MyBank.Controller;

import com.example.MyBank.Entity.OfficeProjectMapping;
import com.example.MyBank.Entity.ProjectCoaMapping;
import com.example.MyBank.Services.OfficeProjectMappingService;
import com.example.MyBank.Services.PcmService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/opm", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class OfficeProjectMappingController {

    @Autowired
    private OfficeProjectMappingService officeProjectMappingService;



    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(officeProjectMappingService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(officeProjectMappingService.getById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody OfficeProjectMapping officeProjectMapping){
        return ResponseEntity.ok(officeProjectMappingService.add(officeProjectMapping));
    }

    @DeleteMapping("/{id}")
    @ApiResponse(responseCode = "204")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        officeProjectMappingService.delete(id);
        return ResponseEntity.ok("Success!!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody OfficeProjectMapping officeProjectMapping) {

        return ResponseEntity.ok(officeProjectMappingService.update(id, officeProjectMapping));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(){
        return null;
    }


}
