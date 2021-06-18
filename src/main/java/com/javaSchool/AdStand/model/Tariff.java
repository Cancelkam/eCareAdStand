package com.javaSchool.AdStand.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Tariff implements Serializable {
    private String title;
    private double price;
}
