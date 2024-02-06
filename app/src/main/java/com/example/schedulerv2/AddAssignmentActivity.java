package com.example.schedulerv2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddAssignmentActivity extends AppCompatActivity {
    private EditText editAssignmentName, editTextDateAndTime, editTextClassSection, editTextLocationAndRoom, editTextProfesser;
    private Button buttonSave;
    private boolean isEditing = false;
    private int assignmentPosition = -1; // Default value means a new class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_assignment);

        editAssignmentName = findViewById(R.id.editAssignmentName);
        editTextDateAndTime = findViewById(R.id.editAssignmentDateAndTime);
        editTextClassSection = findViewById(R.id.editTextAssignmentCourse);
        editTextLocationAndRoom = findViewById(R.id.editTextAssignmentLocationAndRoom);
        buttonSave = findViewById(R.id.buttonSaveAssignment);

        // Check if this activity was opened for editing an existing class
        if (getIntent().hasExtra("editAssignmentInfo")) {
            AssignmentsInfo assignmentInfo = (AssignmentsInfo) getIntent().getSerializableExtra("editAssignmentInfo");
            assignmentPosition = getIntent().getIntExtra("assignmentPosition", -1);
            fillAssignmentInfoToEdit(assignmentInfo);
            isEditing = true;
        }

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveAssignmentInfo();
            }
        });
    }

    private void fillAssignmentInfoToEdit(AssignmentsInfo assignmentInfo) {
        editTextDateAndTime.setText(assignmentInfo.getDateTime());
        editTextClassSection.setText(assignmentInfo.getSection());
        editTextLocationAndRoom.setText(assignmentInfo.getLocation());
    }

    private void saveAssignmentInfo() {
        String dateTime = editTextDateAndTime.getText().toString();
        String professor = editTextProfesser.getText().toString();
        String section = editTextClassSection.getText().toString();
        String location = editTextLocationAndRoom.getText().toString();

        AssignmentsInfo assignmentInfo = new AssignmentsInfo(dateTime, professor, section, location);

        Intent resultIntent = new Intent();
        resultIntent.putExtra("assignmentInfo", assignmentInfo);
        if (isEditing) {
            resultIntent.putExtra("assignmentPosition", assignmentPosition); // Pass back the original position if editing
        }
        setResult(RESULT_OK, resultIntent);
        finish();
    }
}
