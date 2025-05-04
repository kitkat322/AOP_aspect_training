
# AOP Aspect Training Project

This is a training project created while learning **Spring AOP (Aspect-Oriented Programming)**. It demonstrates how to use aspects to implement cross-cutting concerns such as logging, security checks, and exception handling.

## 📦 Project Structure

```
org.example.spring
├── aspects
│   ├── LoggingAspect               # Basic logging before methods
│   ├── SecurityAspect              # Security-related aspect logic
│   ├── ExceptionHandlingAspect     # Handles exceptions using AOP
│   ├── LoggingAndSecurityAspect    # Combined example of multiple advices
│   ├── MyPointcuts                 # Reusable pointcut declarations
├── AbstractLibrary                 # Abstract class for libraries
├── SchoolLibrary / UniLibrary     # Concrete library classes with methods
├── Book                            # A sample model object
├── MyConfig                        # Spring configuration class
├── Test1                           # Main testing class
```

## ⚙️ Features Demonstrated

- `@Aspect`, `@Before`, `@AfterReturning`, `@AfterThrowing`, `@Around`
- Centralized logging and security logic
- Reusable pointcuts
- Programmatic Spring configuration using `@Configuration`
- Simple testing via main method (no Spring Boot)

## 🛠 Technologies

- **Spring AOP (v6.x)**
- **AspectJ Weaver**
- **Maven**
- **Java 17+**

## 🚀 How to Run

1. Make sure Maven dependencies are installed.
2. Open and run the `Test1` class.
3. Check the console output to see how aspects are applied dynamically to library methods.

## 📚 Learning Purpose

This project was built as part of hands-on practice for mastering Spring AOP. It is intended to deepen understanding of:
- Separation of concerns
- Cross-cutting logic
- Aspect declaration and execution order

---

Feel free to fork this repo and use it as a reference for learning or building your own AOP-based solutions.
