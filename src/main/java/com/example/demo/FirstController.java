/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author trainer
 */
@RestController
@RequestMapping(path = "/api")
public class FirstController {
    
    @Autowired
    private PersonRepository personRepository;
    
    @GetMapping(path = "/create")
    public String doCreateData(){
        Person p=new Person("Hans","Mustermann");
        //schreibende Zugriff
        personRepository.save(p);
        personRepository.flush();
        return "Data created";
    }
    
    
}
