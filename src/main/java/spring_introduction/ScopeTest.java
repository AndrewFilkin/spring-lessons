package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Pet dog = context.getBean("dogBean", Pet.class);
        Pet dog2 = context.getBean("dogBean", Pet.class);
        System.out.println((dog == dog2));
    }

}
