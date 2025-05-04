package org.example.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);

        uniLibrary.getBook();
        System.out.println();

        uniLibrary.addBook("Rita", book);
        System.out.println();

        uniLibrary.addMagazine();
        System.out.println();



        context.close();
    }
}
