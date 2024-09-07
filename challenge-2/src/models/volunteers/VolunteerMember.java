package models.volunteers;

import domains.Volunteer;

public class VolunteerMember extends Volunteer {
    private String actualProject;
    private String subGroup;
    private String institution;

    public VolunteerMember(String name, String lastName, String id, String adress, String volunteerCity) {
        super(name, lastName, id, adress, volunteerCity);
    }

    public String getSubGroup() {
        return subGroup;
    }

    public void setSubGroup(String subGroup) {
        this.subGroup = subGroup;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
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
