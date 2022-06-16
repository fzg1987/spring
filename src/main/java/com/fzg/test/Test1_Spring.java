package com.fzg.test;

import com.fzg.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1_Spring {
    public static void main(String[] args) {
        // 传统的方式，手动创建对象
//        Student student = new Student();
//        System.out.println(student);

        //IoC容器自动创建对象，开发者只需要取出对象即可
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student student1 = context.getBean("student",Student.class);
        System.out.println("student1: " + student1);
        Student student2 = context.getBean("student2",Student.class);
        System.out.println("student2: " + student2);
        Student student3 = context.getBean("student3",Student.class);
        System.out.println("student3: " + student3);
    }
}
