package domains.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class Admin extends User {
    private String email;
    private String team;
    private final String role = "Admin";


    public Admin(String name, String lastName, String id, LocalDate birthDate) {
        super(name, lastName, id, birthDate);
    }

}
