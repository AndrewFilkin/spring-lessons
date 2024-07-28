package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> employee = session.createQuery("from Employee")
//                    .getResultList();

            List<Employee> employee = session.createQuery("from Employee where name='Oleg' and salary > 750")
                    .getResultList();

            for (Employee emp: employee) {
                System.out.println(emp);
            }

            session.getTransaction().commit(); // закрыли транзацкию

            System.out.println("Done");
        } finally {
            factory.close();
        }

    }

}
