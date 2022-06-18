package com.fzg.entity;

import lombok.Data;

@Data
public class Person {
    private Integer id;
    private String name;
    private Car car;
}
