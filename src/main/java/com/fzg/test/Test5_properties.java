package com.fzg.test;

import com.fzg.entity.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5_properties {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-properties.xml");
        DataSource dataSource = context.getBean("dataSource",DataSource.class);
        System.out.println(dataSource);
    }
}
