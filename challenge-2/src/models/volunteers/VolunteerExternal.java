package models.volunteers;

import domains.Volunteer;

public class VolunteerExternal extends Volunteer {
    private String actualProject;
    private String eternalOrg;


    public VolunteerExternal(String name, String lastName, String id, String adress, String volunteerCity) {
        super(name, lastName, id, adress, volunteerCity);
    }

    public String getEternalOrg() {
        return eternalOrg;
    }

    public void setEternalOrg(String eternalOrg) {
        this.eternalOrg = eternalOrg;
    }

    public void setActualProject(String actualProject) {
        this.actualProject = actualProject;
    }

    @Override
    public String getActualProject() {
        return this.actualProject;
    }

    @Override
    protected int volunteringHours() {
        return super.hours;
    }

    @Override
    protected String showSensibleData() {
        return this.actualProject + " " + super.hours;
    }
}
