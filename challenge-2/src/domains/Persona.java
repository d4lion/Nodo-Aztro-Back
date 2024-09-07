package domains;

public abstract class Persona {
    protected final String name;
    protected final String lastName;
    protected final String id;
    protected final String adress;

    public Persona(String name, String lastName, String id, String adress) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return name + " " + lastName;
    }


    /**
     * Devulve la informacion sensible de la persona en formato de String
     * @return String
     */
    protected abstract String showSensibleData();

}
