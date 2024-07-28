package hibernate_one_to_one;

import hibernate_one_to_one.entity.Details;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Nikolay", "Sidoriw", "Hr", 750);
//            Details details = new Details("New-York", "+1 98373 8383", "misha@gmail.com");
//
//            employee.setEmpDetails(details);
//            details.setEmployee(employee);
//
//            session.beginTransaction();
//
//            session.save(employee); // session.persist(employee);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Details details = session.get(Details.class, 1);
            details.getEmployee().setEmpDetails(null);
            session.remove(details);

            session.getTransaction().commit();

            System.out.println("Done");


        } finally {
            session.close();
            factory.close();
        }

    }

}
