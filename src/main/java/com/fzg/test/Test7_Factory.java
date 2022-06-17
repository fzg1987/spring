package com.fzg.test;

import com.fzg.entity.Car;
import com.fzg.factory.StaticCarFactory;

public class Test7_Factory {
    public static void main(String[] args) {
        Car car = StaticCarFactory.getCar(1);
        System.out.println(car);
    }
}
