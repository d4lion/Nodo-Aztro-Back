package domains.user;

import domains.travels.Travel;

import java.time.LocalDate;

public class TravelAdmin extends Admin {


    public TravelAdmin(String name, String lastName, String id, LocalDate birthDate) {
        super(name, lastName, id, birthDate);
        //super.setRole("Travel Admin"); // <-- No se modifica el rol en el constructor TODO: Revisar como se hace
    }

    /**
     * Método para modificar el viaje de un cliente.
     *
     * @param client El cliente al que se le va a modificar el viaje.
     * @param newDestination El nuevo destino del viaje.
     * @return Un mensaje indicando si se pudo modificar el viaje o no.
     */
    public String modifyTravel(Client client, Travel newDestination) {
        if (!this.getRole().equals("Admin")) {
            return "You don't have the permissions to modify the travel";
        }
        // Con esto guardamos el viaje antiguo
        Travel oldTravel = client.getTravel();

        // Tras esto podemos modificar el viaje
        return client.modifyTravel(oldTravel, newDestination);
    }
}
