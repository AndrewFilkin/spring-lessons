package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> studentsList = new ArrayList<>();

    public void addStudent() {
        Student st1 = new Student("Andrew Filkin", 4, 7.5);
        Student st2 = new Student("Ivan Ivanovich", 3, 7.1);
        Student st3 = new Student("Liza Leonove", 5, 6.1);
        studentsList.add(st1);
        studentsList.add(st2);
        studentsList.add(st3);
    }

    public List<Student> getStudentsList() {
        System.out.println("Начало рабты метода getStudentsList");
        System.out.println(studentsList.get(3));
        System.out.println("Information from method getStudentsList");
        System.out.println(studentsList);
        return studentsList;
    }
}



