package hibernate_test;

import aop.Student;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Sidarov", "IBM", 700);
            session.beginTransaction();
            session.save(employee);   // or session.persist(employee);
//            session.getTransaction().commit(); // закрыли транзацкию

            int myId = employee.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employee1 = session.get(Employee.class, myId);
            session.getTransaction().commit(); // закрыли транзацкию
            System.out.println(employee1);

            System.out.println("Done");
        } finally {
            factory.close();
        }

    }

}
