package org.example.spring.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.example.spring.Book;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    @Before("org.example.spring.aspects.MyPointcuts.allAddMethods()") // выражение в скобках - это pointcut
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature + "\n");
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod() + "\n");
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType() + "\n");
        System.out.println("methodSignature.getName() = " + methodSignature.getName() + "\n");


        if(methodSignature.getName().equals("addBook")){
            Object[] args = joinPoint.getArgs();

            for (Object obj : args){
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: " + "\n" +
                            "название" + myBook.getName() + "\n" +
                            "автор - " + myBook.getAuthor() + "\n" +
                            "год издательства - " + myBook.getYearOfPublication());
                } else if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавил " + obj);
                }
            }
        }
        System.out.println("beforeAddLoggingAdvice: логирование при попытке получить книгу/журнал");
    }
}
