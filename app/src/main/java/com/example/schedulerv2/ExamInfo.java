package com.example.schedulerv2;
import java.io.Serializable;
//do the same thing for assignments
public class ExamInfo implements Serializable{
    private String dateTime;
    private String name;
    private String course;
    private String section;
    private String location;

    public ExamInfo(String dateTime, String name, String course, String location) {
        this.dateTime = dateTime;
        this.name = name;
        this.course = course;
        this.location = location;
    }

    // Getters
    public String getDateTime() { return dateTime; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public String getLocation() { return location; }
}
