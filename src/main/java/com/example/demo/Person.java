/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author trainer
 */
@Data
@Entity
public class Person {
    @Id
    private String lastname;
    private String firstname;

    public Person() {
    }

    public Person(String firstname, String lastname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }
    
    
}
