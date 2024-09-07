package models.teachers;

import models.Teacher;


public class TitularTeacher extends Teacher {
    private String university;
    private String degree;
    private String room;


    public TitularTeacher(String name, String lastName, String id, String adress, String work, String project, String subject) {
        super(name, lastName, id, adress, work, project, subject);
    }


    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
