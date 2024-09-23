package domains.user;

// domains
import domains.travels.Travel;

// Java
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Lombo
import lombok.Getter;
import lombok.Setter;

@Getter
public class Client extends User {
    @Setter
    Travel travel;
    List<Travel> travels;

    public Client(String name, String lastName, String id, LocalDate birthDate, Travel ex_travel) {
        super(name, lastName, id, birthDate);
        this.travel = ex_travel;
        this.travels = new ArrayList<>(); // <-- Se debe inicializar la lista si no suelta un "NullPointerException"
        this.travels.add(ex_travel);
    }

    public String addNewTravel(Travel travel) {
        this.travels.add(travel);
        return "Travel " + travel.getOrigin() + " added" + "\nid: " + travel.getId();
    }

    /**
     * Método para modificar el viaje de un cliente.
     *
     * @param odlTravel El viaje antiguo que se va a modificar.
     * @param newTravel El nuevo viaje que se va a agregar.
     * @return Un mensaje indicando si se pudo modificar el viaje o no.
     */
    protected String modifyTravel(Travel odlTravel, Travel newTravel) {

        // En dado caso que no se pueda modificar el viaje se lanza una excepción
        try {
            this.travel = newTravel;
            int indexOfOldTravel = this.travels.lastIndexOf(odlTravel);

            this.travels.remove(indexOfOldTravel);
            this.travels.add(newTravel);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return "Travel modified successfully " + "new travel added: " + newTravel.getOrigin();
    }
}