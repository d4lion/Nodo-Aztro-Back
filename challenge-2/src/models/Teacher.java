package models;

import domains.Salaried;


public class Teacher extends Salaried {
    private final String project;
    private final String subject;
    private float salaryBonus;


    public Teacher(String name, String lastName, String id, String adress, String work, String project, String subject) {
        super(name, lastName, id, adress, work);
        this.project = project;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public float getSalaryBonus() {
        return salaryBonus;
    }

    /**
     * @param salaryBonus El bonus del salario dado en porcentaje (Ejemplo: 10 para un 10%)
     */

    public void setSalaryBonus(float salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    @Override
    public String actualProject() {
        return this.project;
    }

    @Override
    public double salaryBonus() {
        return super.getSalary() * this.salaryBonus / 100;
    }

    @Override
    protected String showSensibleData() {
        return this.project + " " + this.salaryBonus + " " + super.getSalary();
    }
}
