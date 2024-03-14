package com.example.MyBank.Services;



import com.example.MyBank.Entity.User;
import com.example.MyBank.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    @Autowired
    public UserRepo repo;


    public List<User> getData() {
        return repo.findAll();
    }

    public User save(User user) {
        return repo.save(user);
    }

    public void deleteData(Long id) {
        repo.deleteById(id);
    }

    public User getDataByID(Long id) {
        return repo.findById(id).get();
    }

}
