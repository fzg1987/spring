package com.fzg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4_Depend {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-depend.xml");
    }
}
