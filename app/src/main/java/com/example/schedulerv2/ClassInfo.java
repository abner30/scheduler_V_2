package com.example.schedulerv2;
import java.io.Serializable;
public class ClassInfo implements Serializable{
    private String dateTime;
    private String daysOfWeek;
    private String professor;
    private String section;
    private String location;

    public ClassInfo(String dateTime, String daysOfWeek, String professor, String section, String location) {
        this.dateTime = dateTime;
        this.daysOfWeek = daysOfWeek;
        this.professor = professor;
        this.section = section;
        this.location = location;
    }

    // Getters
    public String getDateTime() { return dateTime; }
    public String getDaysOfWeek() { return daysOfWeek; }
    public String getProfessor() { return professor; }
    public String getSection() { return section; }
    public String getLocation() { return location; }
}
