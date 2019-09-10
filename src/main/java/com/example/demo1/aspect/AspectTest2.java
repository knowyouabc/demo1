package com.example.demo1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectTest2 {

    @Around(value = "@annotation(annAspect)")
    public Object logAround(ProceedingJoinPoint pjp, AnnAspect annAspect) throws Throwable {
        System.out.println("eeeeee" + annAspect.value() + pjp.getArgs()[0]);
        if (true) {
            return pjp.proceed();
        } else {
            return "wwwwwwwww";
        }
    }

}
