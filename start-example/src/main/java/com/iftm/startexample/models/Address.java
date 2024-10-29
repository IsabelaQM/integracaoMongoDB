package com.iftm.startexample.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
public class Address {

    private String street;

    private int number;

    public Address(String street, int number){
        this.street = street;
        this.number = number;
    }
}
