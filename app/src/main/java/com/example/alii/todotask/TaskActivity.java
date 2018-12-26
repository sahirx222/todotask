package com.example.alii.todotask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class TaskActivity extends AppCompatActivity {
Button addtask;
EditText taskname, taskdes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        addtask=findViewById(R.id.addtask);
        taskdes=findViewById(R.id.taskdes);
        taskname=findViewById(R.id.taskname);
    }
}
