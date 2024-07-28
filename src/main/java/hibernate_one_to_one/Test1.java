package hibernate_one_to_one;

import hibernate_one_to_one.entity.Details;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smornow", "IT", 2000);
//            Details details = new Details("Chicago", "+1 98373 8383", "oleg@gmail.com");
//            employee.setEmpDetails(details);
//
//            session.beginTransaction();
//
//            session.save(employee); // session.persist(employee);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done");


//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 1);
//            System.out.println(emp);
//            System.out.println(emp.getEmpDetails());
//            session.getTransaction().commit();
//            System.out.println("Done");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 3);
            session.remove(emp);

            session.getTransaction().commit();
            System.out.println("Done");

        } finally {
            session.close();
            factory.close();
        }

    }

}
