package com.iftm.startexample.models.dto;

import java.io.Serializable;

import com.iftm.startexample.models.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO implements Serializable{
    private String id;
    private String name;
    private int age;
    private Address address;

    public UserDTO(User user){
        this.id = user.getId().toString();
        this.name = user.getName();
        this.age = user.getAge();
        this.address = user.getAddress();
    }

    public UserDTO(String name, int age){
        this.name = name;
        this.age = age;
    }

    
}