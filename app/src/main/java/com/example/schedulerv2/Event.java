package com.example.schedulerv2;

import java.util.List;

public class Event {
    private String title;
    private String description;
    private int year;
    private int month;
    private int dayOfMonth;

    public Event(String title, String description, int year, int month, int dayOfMonth) {
        this.title = title;
        this.description = description;
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
    }

    public String getDescription() {
        return description;
    }

    public static String getEventDescription(int year, int month, int dayOfMonth, List<Event> eventList){
        for (Event event : eventList) {
            if (event.matches(year, month, dayOfMonth)) {
                return event.getDescription();
            }
        }
        return null;
    }


    public boolean matches(int year, int month, int dayOfMonth) {
        return this.year == year && this.month == month && this.dayOfMonth == dayOfMonth;
    }
}
