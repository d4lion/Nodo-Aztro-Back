import domains.travels.Travel;
import domains.travels.Provider;
import domains.user.Client;
import domains.user.TravelAdmin;

import java.time.LocalDate;
import java.time.LocalTime;


public class Main {

    public static void main(String ... args) {


        // Se prepara el primer viaje "De ida"
        LocalDate fechaSalida = LocalDate.of(2024, 9, 15);
        LocalTime horaSalida = LocalTime.of(12, 30);

        Travel travel = new Travel("Medellin", "Silicon Valley", fechaSalida , horaSalida,
                "5000", new Provider("Airplane", "Booking", "99843"));


        // Instancias de viajes para pruebas
        LocalDate fechaRegreso = LocalDate.of(2024, 9, 23);
        LocalTime horaRegreso = LocalTime.of(12, 30);

        Travel trave1 = new Travel("Silicon Valley", "Medellin", fechaRegreso , horaRegreso,
                "5000", new Provider("Airplane", "Booking", "99843"));

        LocalDate fechaSalida2 = LocalDate.of(2024, 10, 3);
        LocalTime horaSalida2 = LocalTime.of(10, 10);

        Travel travel2 = new Travel("Medellin", "Rio de Janeiro", fechaSalida2 , horaSalida2,
                "5000", new Provider("Airplane", "AirBnB", "10832"));

        LocalDate fechaSalida3 = LocalDate.of(2024, 11, 4);
        LocalTime horaSalida3 = LocalTime.of(11, 50);

        Travel travel3 = new Travel("Medellin", "Rio de Janeiro", fechaSalida3 , horaSalida3,
                "5000", new Provider("Airplane", "AirBnB", "10832"));


        // Instancias de personal
        Client cliente = new Client("Daniel", "Martinez", "123", LocalDate.of(2006, 7, 24) , travel);
        TravelAdmin travelAdmin = new TravelAdmin("Juan", "Perez", "456", LocalDate.of(1990, 5, 12));



        // Con esto tenemos la posibilidad de agregar un nuevo viaje al cliente, el array de viajes se inicializa en el constructor
        System.out.println(cliente.addNewTravel(trave1) + "\n");
        System.out.println(cliente.addNewTravel(travel2) + "\n");

        // Con esto se puede ver los viajes que tiene el cliente tal como en JavaScript por medio de un forEach
        cliente.getTravels().forEach(travel1 -> {
            System.out.println(travel1.FromTo() + " --> " + travel1.getDate());
        });

        // Se modifica el viaje del cliente por medio del travelAdmin
        System.out.println(travelAdmin.modifyTravel(cliente, travel3) + "\n");

        // Se verifica que los nuevos viajes si se hayan actualizado
        cliente.getTravels().forEach(nuevosViajes -> {
            System.out.println(nuevosViajes.FromTo() + " --> " + nuevosViajes.getDate());
        });

    }
}