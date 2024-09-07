package domains;

public abstract class Salaried extends Persona {
    private double salary;
    private final String work;

    public Salaried(String name, String lastName, String id, String adress, String work) {
        super(name, lastName, id, adress);
        this.work = work;
    }

    // Getters and Setters

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getWork() {
        return this.work;
    }


    /**
     * Este metodo debe retornar el proyecto actual del empleado
     * @return String
     */
    public abstract String actualProject();

    /**
     * Este metodo debe proporcionar un procentaje de bono al salario y retornarlo
     * @return double
     */
    public abstract double salaryBonus();
}
