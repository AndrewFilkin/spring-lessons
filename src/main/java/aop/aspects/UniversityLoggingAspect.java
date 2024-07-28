package aop.aspects;

import aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudentsList())")
//    public void beforeGetStudentLoggingAdvice() {
//        System.out.println("beforeGetStudentLoggingAdvice: логируем перед ");
//    }

    @AfterThrowing(pointcut = "execution(* getStudentsList())", throwing = "exeption")
    public void afterThrowingStudentLoggingAdvice(Throwable exeption) {
        System.out.println("afterThrowingStudentLoggingAdvice " + "Логируем исключение " + exeption);
    }

//    @AfterReturning(pointcut="execution(* getStudentsList())", returning = "studentsList")
//    public void afterReturningStudentLoggingAdvice(List<Student> studentsList) {
//        Student firstStudent = studentsList.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//
//        System.out.println("afterReturningStudentLoggingAdvice: логируем после ");
//    }

}
