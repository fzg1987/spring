package com.fzg.entity;

import lombok.*;

@Data
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private Classes classes;
}
