package com.example.MyBank.Controller;

import com.example.MyBank.Entity.ProjectCoaMapping;
import com.example.MyBank.Entity.ProjectDetails;
import com.example.MyBank.Services.PcmService;
import com.example.MyBank.Services.ProjectDetailsService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pd", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class ProjectDetailsController {

    @Autowired
    private ProjectDetailsService projectDetailsService;



    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(projectDetailsService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(projectDetailsService.getById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody ProjectDetails projectDetails){
        return ResponseEntity.ok(projectDetailsService.add(projectDetails));
    }

    @DeleteMapping("/{id}")
    @ApiResponse(responseCode = "204")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        projectDetailsService.delete(id);
        return ResponseEntity.ok("Success!!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody ProjectDetails projectDetails) {

        return ResponseEntity.ok(projectDetailsService.update(id, projectDetails));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(){
        return null;
    }


}
