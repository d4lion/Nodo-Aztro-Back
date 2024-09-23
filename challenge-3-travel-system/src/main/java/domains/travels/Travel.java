package domains.travels;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

// Lombok
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Travel {
    String origin;
    String destination;
    String price;
    String id;

    LocalDate date;
    LocalTime time;
    Provider provider;

    public Travel(String origin, String destination, LocalDate date, LocalTime time, String price, Provider provider) {
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.price = price;
        this.provider = provider;
        generateUUID();
    }

    private void generateUUID() {
        this.id = UUID.randomUUID().toString();
    }

    public String FromTo() {
        return this.origin + " --> " + this.destination;
    }
}