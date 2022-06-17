package com.fzg.test;

import com.fzg.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6_P {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-p.xml");
        Student student = context.getBean("student",Student.class);
        System.out.println(student);
    }
}
