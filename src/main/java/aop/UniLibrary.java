package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary ");
    }

    public String returnBook(String name) {
        int a = 10/0;
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return name;
    }

    public void getMagazine() {
        System.out.println("Мы берем книгу из getMagazine");
        System.out.println("---------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println("---------------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("---------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем книгу в Magazine");
        System.out.println("---------------------------------------");
    }

}
