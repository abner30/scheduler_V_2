package com.example.schedulerv2;

import static android.view.View.GONE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import com.example.schedulerv2.*;


public class classes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);
//        CalendarView calendarView = findViewById(R.id.calendarView);


        View classback = findViewById(R.id.classback);
//
        classback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( classes.this, MainActivity.class);
                startActivity(intent);
            }
        });


//        // Set a listener to respond to date changes
//        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
//            @Override
//            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
//                //displays selected date
//                String selectedDate = (month + 1) + "/" + (dayOfMonth) + "/" + year;
//                Toast.makeText(MainActivity.this, "Selected Date: " + selectedDate, Toast.LENGTH_SHORT).show();
////                String eventDescription = Event.getEventDescription(year, month, dayOfMonth, eventList);
////
////                if (eventDescription != null) {
////                    // Display the event locally within the app (e.g., show a Toast)
////                    Toast.makeText(MainActivity.this, "Event on " + selectedDate + ": " + eventDescription, Toast.LENGTH_SHORT).show();
////                } else {
////                    // No event for the selected date
////                    Toast.makeText(MainActivity.this, "No event on " + selectedDate, Toast.LENGTH_SHORT).show();
////                }
////                calendarView.invalidate();
//            }
//        });


    }










}