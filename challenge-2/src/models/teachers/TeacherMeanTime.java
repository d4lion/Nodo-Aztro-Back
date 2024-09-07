package models.teachers;

import models.Teacher;

public class TeacherMeanTime extends Teacher {

    private String whoReplace;

    public TeacherMeanTime(String name, String lastName, String id, String adress, String work, String project, String subject) {
        super(name, lastName, id, adress, work, project, subject);
    }


    public String getWhoReplace() {
        return whoReplace;
    }

    public void setWhoReplace(String whoReplace) {
        this.whoReplace = whoReplace;
    }
}
