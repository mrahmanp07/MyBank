package com.example.MyBank.Controller;

import com.example.MyBank.Entity.ChartOfAccounts;
import com.example.MyBank.Entity.ProjectCoaMapping;
import com.example.MyBank.Services.ChartOfAccountsService;
import com.example.MyBank.Services.PcmService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pcm", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class PcmController {

    @Autowired
    private PcmService pcmService;



    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(pcmService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id) {
        return ResponseEntity.ok(pcmService.getById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody ProjectCoaMapping projectCoaMapping){
        return ResponseEntity.ok(pcmService.add(projectCoaMapping));
    }

    @DeleteMapping("/{id}")
    @ApiResponse(responseCode = "204")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        pcmService.delete(id);
        return ResponseEntity.ok("Success!!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id,
                                    @RequestBody ProjectCoaMapping projectCoaMapping) {

        return ResponseEntity.ok(pcmService.update(id, projectCoaMapping));
    }

    @GetMapping("/search")
    public ResponseEntity<?> search(){
        return null;
    }


}
