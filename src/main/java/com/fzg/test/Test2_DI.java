package com.fzg.test;

import com.fzg.entity.Classes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2_DI {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-di.xml");
//        String[] names = context.getBeanDefinitionNames();
        Classes classes = context.getBean("classes",Classes.class);
//        Student student = context.getBean("student",Student.class);
//        Student student2 = context.getBean("student2",Student.class);
        System.out.println(classes);
//        System.out.println(student);
    }
}
