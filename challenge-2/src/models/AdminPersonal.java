package models;

import domains.Salaried;

public class AdminPersonal extends Salaried {
    private final String project;
    private final String department;
    private float salaryBonus;

    public AdminPersonal(String name, String lastName, String id, String adress, String work, String project, String department) {
        super(name, lastName, id, adress, work);
        this.project = project;
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
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
