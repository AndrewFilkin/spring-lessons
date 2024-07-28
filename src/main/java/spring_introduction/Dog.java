package spring_introduction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("dogBean")
@Scope("prototype")
public class Dog implements Pet{

    public String name;

    public Dog(@Value("${dog.name}") String name) {
        this.name = name;
        System.out.println("Dog constructor + " + this.name);
    }

    @PostConstruct
    protected void init() {
        System.out.println("Dog init");
    }

    @Override
    public void say () {
        System.out.println("Bow-Wow");
    }
}
