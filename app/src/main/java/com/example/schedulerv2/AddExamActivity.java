package com.example.schedulerv2;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class AddExamActivity extends AppCompatActivity {

    private EditText editTextExamName, editTextExamDateAndTime, editTextExamCourse, editTextExamLocationAndRoom;
    private Button buttonSave;
    private boolean isEditing = false;
    private int examPosition = -1; // Default value means a new exam

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_exam);
        editTextExamName = findViewById(R.id.editTextExamName);
        editTextExamDateAndTime = findViewById(R.id.editTextExamDateAndTime);
        editTextExamCourse = findViewById(R.id.editTextExamCourse);
        editTextExamLocationAndRoom = findViewById(R.id.editTextExamLocationAndRoom);
        buttonSave = findViewById(R.id.buttonSaveExam);

        // Check if this activity was opened for editing an existing exam
        if (getIntent().hasExtra("editExamInfo")) {
            ExamInfo examInfo = (ExamInfo) getIntent().getSerializableExtra("editExamInfo");
            examPosition = getIntent().getIntExtra("examPosition", -1);
            fillExamInfoToEdit(examInfo);
            isEditing = true;
        }

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveExamInfo();
            }
        });
    }

    private void fillExamInfoToEdit(ExamInfo examInfo) {
        editTextExamName.setText(examInfo.getName());
        editTextExamDateAndTime.setText(examInfo.getDateTime());
        editTextExamLocationAndRoom.setText(examInfo.getLocation());
        editTextExamCourse.setText(examInfo.getCourse());
    }

    private void saveExamInfo() {
        String dateTime = editTextExamDateAndTime.getText().toString();
        String daysOfWeek = editTextExamName.getText().toString();
        String professor = editTextExamCourse.getText().toString();
        String location = editTextExamLocationAndRoom.getText().toString();

        ExamInfo examInfo = new ExamInfo(dateTime, daysOfWeek, professor, location);

        Intent resultIntent = new Intent();
        resultIntent.putExtra("examInfo", examInfo);
        if (isEditing) {
            resultIntent.putExtra("examPosition", examPosition); // Pass back the original position if editing
        }
        setResult(RESULT_OK, resultIntent);
        finish();
    }
}
