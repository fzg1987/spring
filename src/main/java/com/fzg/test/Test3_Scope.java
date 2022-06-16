package com.fzg.test;

import com.fzg.entity.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3_Scope {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-scope.xml");
//        User user1 = context.getBean("user1",User.class);
//        User user2 = context.getBean("user2",User.class);
//        System.out.println(user1);
//        System.out.println(user2);
        Account account = context.getBean("account",Account.class);
        System.out.println(account);
    }
}
