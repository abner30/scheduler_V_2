package com.example.schedulerv2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class assignments extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignments);
//        CalendarView calendarView = findViewById(R.id.calendarView);


        View assignmentsback = findViewById(R.id.assignemntsback);

        assignmentsback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(assignments.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
