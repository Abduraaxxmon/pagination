package com.example.pagination.controller;

import com.example.pagination.Entity.Usersname;
import com.example.pagination.Servise.Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private Interface servise;

    @GetMapping
    public Page<Usersname> SearchingByname(@RequestParam(required = false,defaultValue = "0") int page,
                                           @RequestParam(required = false,defaultValue = "5") int size,
                                           @RequestParam String name){
        return servise.searchByName(page,size,name);
    }
}
