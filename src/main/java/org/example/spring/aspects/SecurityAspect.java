package org.example.spring.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class SecurityAspect {

    @Before("org.example.spring.aspects.MyPointcuts.allAddMethods()") // выражение в скобках - это pointcut
    public void beforeAddSecurityAdvice(){
        System.out.println("beforeAddSecurityAdvice: проверка прав при попытке получить книгу/журнал");
    }
}
