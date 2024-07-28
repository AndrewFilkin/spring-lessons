package aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(1)
public class LoggingAndSecurityAspect {

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature signature = (MethodSignature) joinPoint.getSignature();

        System.out.println("MethodSignature: " + signature.getName());


        System.out.println("beforeAddLoggingAdvice: попытка получить книгу");
        System.out.println("---------------------------------------");
    }


//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodFromUniLibrary() {}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void justReturnMagazine() {}
//
//    @Pointcut("allMethodFromUniLibrary() && !justReturnMagazine()")
//    public void allMethodExceptReturnMagazine() {}
//
//    @Before("allMethodExceptReturnMagazine()")
//    public void allMethodExceptReturnMagazineAdvice() {
//        System.out.println("allMethodExceptReturnMagazineAdvice");
//    }

//    @Pointcut("execution(* aop.UniLibrary.get* ())")
//    private void allGetMethodFromUniLibrary() {}
//
//    @Pointcut("execution(* aop.UniLibrary.return* ())")
//    private void allReturnMethodFromUniLibrary() {}
//
//    @Pointcut("allGetMethodFromUniLibrary() || allReturnMethodFromUniLibrary()")
//    private void allGetAndReturnMethodFromUniLibrary() {}

//    @Before("allGetMethodFromUniLibrary()")
//    public void beforeGetLogingAdvice() {
//        System.out.println("beforeGetLogingAdvice");
//    }
//
//    @Before("allReturnMethodFromUniLibrary()")
//    public void beforeReturnLogingAdvice() {
//        System.out.println("beforeReturnLogingAdvice");
//    }

//    @Before("allGetAndReturnMethodFromUniLibrary()")
//    public void beforeGetAndReturnLogingAdvice() {
//        System.out.println("beforeGetAndReturnLogingAdvice");
//    }


//    @Pointcut("execution(* get*())")
//    public void allGetMethods() {
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("Logging Advice: попытка получить книгу");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("Security Advice: проверка прав на получение книги или журнала");
//    }

}
