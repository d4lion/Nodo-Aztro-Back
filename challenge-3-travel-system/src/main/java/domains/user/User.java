package domains.user;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
public abstract class User {
    @Setter
    private String name;

    @Setter
    private String lastName;

    @Setter
    private String id;

    @Setter
    private String email;

    @Setter
    private String role;

    @Setter
    private String phoneNumber;

    @Setter
    private int age;


    LocalDate birthDate;


    public User(String name, String lastName, String id, LocalDate birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getFullName() {
        return this.name + " " + this.lastName;
    }
}
