package hibernate_one_to_one.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "details")
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "city")
    private String city;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @OneToOne(mappedBy = "empDetails", cascade = {CascadeType.REFRESH, CascadeType.PERSIST})
    private Employee employee;

    public Details() {
    }

    public Details(String city, String phone_number, String email) {
        this.city = city;
        this.phoneNumber = phone_number;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone_number() {
        return phoneNumber;
    }

    public void setPhone_number(String phone_number) {
        this.phoneNumber = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Details{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", phone_number='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
