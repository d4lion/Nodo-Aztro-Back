package domains;

public abstract class Volunteer extends Persona {

    // El voluntario está en una ciudad donde presta su servicio
    protected final String volunteerCity;
    protected int hours;


    public Volunteer(String name, String lastName, String id, String adress, String volunteerCity) {
        super(name, lastName, id, adress);
        this.volunteerCity = volunteerCity;
    }


    public String getVolunteerCity() {
        return volunteerCity;
    }

    /**
     * Este metodo debe retornar el proyecto actual del empleado
     * @return String
     */
    public abstract String getActualProject();

    /**
     * Este metodo debe proporcionar las horas de voluntariado y retornarlo
     * @return double
     */
    protected abstract int volunteringHours();

}
