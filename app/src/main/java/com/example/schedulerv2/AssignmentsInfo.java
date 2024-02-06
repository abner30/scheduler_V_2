package com.example.schedulerv2;
import java.io.Serializable;

public class AssignmentsInfo implements Serializable{
    private String dateTime;
    private String name;
    private String course;
    private String section;
    private String location;

    public AssignmentsInfo(String dateTime, String name, String course, String location) {
        this.dateTime = dateTime;
        this.name = name;
        this.course = course;
        this.section = section;
        this.location = location;
    }

    // Getters
    public String getDateTime() { return dateTime; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public String getSection() { return section; }
    public String getLocation() { return location; }
}
