package spring_introduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{

    @Value("${cat.name}")
    private String name;

    public Cat() {
        System.out.println("Cat constructor with name");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow say cat name " + this.name);
    }
}
