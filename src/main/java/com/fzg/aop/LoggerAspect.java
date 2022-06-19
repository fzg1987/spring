package com.fzg.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggerAspect {
    @Before("execution(public int com.fzg.aop.impl.CalImpl.add(..))")
    public void before(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println(name + "方法的参数是" + args);
    }
}
