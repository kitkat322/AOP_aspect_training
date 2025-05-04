package org.example.spring.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

//    @Pointcut("execution(* org.example.spring.UniLibrary.*(..))")
//    public void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void org.example.spring.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUnilibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUnilibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice(){
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }


//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){}
//
//    @Before("allGetMethods()") // выражение в скобках - это pointcut
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: логирование при попытке получить книгу/журнал");
//    }
//
//    @Before("allGetMethods()") // выражение в скобках - это pointcut
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: проверка прав при попытке получить книгу/журнал");
//    }

}
