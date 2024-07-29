package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {

//            session = factory.getCurrentSession();
//
//            Department department = new Department("HR", 500, 1500);
//            Employee employee1 = new Employee("Andrew", "Filkin", 800);
//            Employee employee2 = new Employee("Oleg", "Shewchow", 1000);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            session.beginTransaction();
//
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done");

            // -----------------------------------


//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Department department = session.get(Department.class, 2);
//            Employee employee1 = new Employee("Andrew2", "Filkin2", 400);
//            Employee employee2 = new Employee("Oleg2", "Shewchow2", 500);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done");

            // ----------------------------------

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmployeeList());
//
//            session.getTransaction().commit();
//            System.out.println("Done");

            // -------------------------

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done");

            // -------------------------

            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 3);
            session.remove(department);

            session.getTransaction().commit();
            System.out.println("Done");


        } finally {
            session.close();
            factory.close();
        }

    }

}
