package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    private Pet pet;

    public Person () {
        System.out.println("Person constructor");
    }

    @Autowired
    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        System.out.println("Setter Person");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely pet");
        pet.say();
    }
}
