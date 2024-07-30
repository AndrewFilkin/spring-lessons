package hibernate_many_to_many;

import aop.Student;
import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Section.class)
                .addAnnotatedClass(Child.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = sessionFactory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//
//            Child  child1 = new Child("Filip", 13);
//            Child  child2 = new Child("Marina", 10);
//            Child  child3 = new Child("Lena", 7);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");

            // ----------------------------

//            session = sessionFactory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Section section2 = new Section("Cricket");
//            Section section3 = new Section("Gamer");
//
//            Child  child1 = new Child("Igor", 20);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.persist(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");

            // -----------------------

//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());

//            session.getTransaction().commit();
//            System.out.println("Done!!!");

            // -------------------------

//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");

            // ------------------------

//            session = sessionFactory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 5);
//
//            session.remove(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");

            // --------------------------

            session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Child child = session.get(Child.class, 4);

            session.remove(child);

            session.getTransaction().commit();
            System.out.println("Done!!!");

        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
