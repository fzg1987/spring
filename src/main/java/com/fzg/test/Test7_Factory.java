package com.fzg.test;

import com.fzg.entity.Car;
import com.fzg.factory.InstanceCarFactory;
import com.fzg.factory.StaticCarFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test7_Factory {
    public static void main(String[] args) {
//        Car car = StaticCarFactory.getCar(1);
//        System.out.println(car);
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-factory.xml");
        Car car = context.getBean("car1",Car.class);
        System.out.println(car);

        // 实例化工厂类
//        InstanceCarFactory instanceCarFactory = new InstanceCarFactory();
//        // 获取car
//        Car car1 = instanceCarFactory.getCar(1);
//        System.out.println(car1);
        Car car2 = context.getBean("car2",Car.class);
        System.out.println(car2);
    }
}
