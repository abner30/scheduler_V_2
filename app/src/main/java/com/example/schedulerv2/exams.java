package com.example.schedulerv2;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class exams extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exams);
//        CalendarView calendarView = findViewById(R.id.calendarView);


        View examsback = findViewById(R.id.examsback);
//
        examsback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(exams.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

