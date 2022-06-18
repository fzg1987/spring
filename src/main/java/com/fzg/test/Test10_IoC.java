package com.fzg.test;

import com.fzg.controller.MyController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test10_IoC {
    private static double score = 90;
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");
//        String[] names = context.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
        MyController controller = context.getBean("controller",MyController.class);
        String result = controller.doController(score);
        System.out.println(result);
    }
}
