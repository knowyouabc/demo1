package com.example.demo1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectTest {

    @Pointcut("execution(String com.example.demo1.service.PersonService.getData(..))")
    public void printCut() {}

    @Around("printCut()")
    public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("eeeeee");
        if (true) {
            return pjp.proceed();
        } else {
            return "wwwwwwwww";
        }
    }

    @Before("printCut()")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println(joinPoint.getArgs()[0]);
        System.out.println("bbbbbbb");
    }

    @After("execution(String com.example.demo1.service.PersonService.getData(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("ccccccc");
    }

    @AfterReturning(value="printCut()", returning="result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("ddddddd");
        System.out.println(result);
    }
}
