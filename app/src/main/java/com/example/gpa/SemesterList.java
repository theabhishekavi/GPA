package com.example.gpa;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SemesterList extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester_list);
        Button btn1 = findViewById(R.id.btnSem1);
//        Button btn2 = findViewById(R.id.btnSem2);
        Button btn3 = findViewById(R.id.btnSem3);
//        Button btn4 = findViewById(R.id.btnSem4);
//        Button btn5 = findViewById(R.id.btnSem5);
//        Button btn6 = findViewById(R.id.btnSem6);
//        Button btn7 = findViewById(R.id.btnSem7);
//        Button btn8 = findViewById(R.id.btnSem8);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SemesterList.this,ThirdSemester.class));
            }
        });



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SemesterList.this,FirstSemester.class));
            }
        });
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(SemesterList.this,ThirdSemester.class));
//            }
//        });
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(SemesterList.this,ThirdSemester.class));
//            }
//        });
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(SemesterList.this,ThirdSemester.class));
//            }
//        });
//        btn6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(SemesterList.this,ThirdSemester.class));
//            }
//        });
//        btn7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(SemesterList.this,ThirdSemester.class));
//            }
//        });
//        btn8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(SemesterList.this,ThirdSemester.class));
//            }
//        });


    }
}
