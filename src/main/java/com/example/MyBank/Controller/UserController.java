package com.example.MyBank.Controller;


import com.example.MyBank.Dto.UserDto;
import com.example.MyBank.Entity.User;
import com.example.MyBank.Services.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class UserController {

    @Autowired
    public UserService service;

    @GetMapping("/getAll")
    public List<User> getData() {
        return service.getData();
    }

    @GetMapping
    public List<UserDto> getDataDto() {
        List<UserDto> userDtos = new ArrayList<>();
        for (User user: service.getData()
             ) {
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(user,userDto);
            userDtos.add(userDto);
        }
        return userDtos;
    }

    @PostMapping
    public User addData(@RequestBody User user) {
        return service.save(user);
    }
    @GetMapping("/{id}")
    public User getDataByID(@PathVariable("id") Long id) {
        return service.getDataByID(id);
    }
    @PutMapping("/update/{id}")
    public User updateData(@PathVariable("id") Long id,
                           @RequestBody User user) {
        user.setId(id);
        return service.save(user);
    }
    @DeleteMapping("/{id}")
    public void deleteData(@PathVariable("id") Long id) {
         service.deleteData(id);
    }

}
