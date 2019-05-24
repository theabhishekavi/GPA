package com.example.gpa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private int ctMaths = 4,ctFcs = 4,ctStld = 4,ctCs = 4,ctDs =4,ctCgm =4;
    private int cpStld = 1, cpDs = 1, cpCs = 1, cpCgm = 1;
    float gpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText thMaths = findViewById(R.id.thMath3);
        final EditText thFcs = findViewById(R.id.thFcs3);
        final EditText thStld = findViewById(R.id.thStld3);
        final EditText thCs = findViewById(R.id.thCs3);
        final EditText thDs = findViewById(R.id.thDs3);
        final EditText thCgm = findViewById(R.id.thCgm3);

        final EditText pcStld = findViewById(R.id.pcStld3);
        final EditText pcDs = findViewById(R.id.pcDs3);
        final EditText pcCs = findViewById(R.id.pcCs3);
        final EditText pcCgm = findViewById(R.id.pcCgm3);

        final TextView tvResult = findViewById(R.id.tvResult);


        Button btnOk = findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int gtMaths = gradePoint(thMaths.getText().toString());
                int gtFcs = gradePoint(thFcs.getText().toString());
                int gtStld = gradePoint(thStld.getText().toString());
                int gtCs = gradePoint(thCs.getText().toString());
                int gtDs = gradePoint(thDs.getText().toString());
                int gtCgm = gradePoint(thCgm.getText().toString());

                int gpStld = gradePoint(pcStld.getText().toString());
                int gpDs = gradePoint(pcDs.getText().toString());
                int gpCs = gradePoint(pcCs.getText().toString());
                int gpCgm = gradePoint(pcCgm.getText().toString());

                float sumCredit = cpCgm+cpCs+cpDs+cpStld
                        +ctCgm+ctCs+ctDs+ctFcs+ctMaths+ctStld;

                float productCreditGrade = (gtMaths*ctMaths)+(gtFcs*ctFcs)+
                        (gtStld*ctStld)+(gtCs*ctCs)+(gtDs*ctDs)+(gtCgm*ctCgm)+
                        (gpStld*cpStld)+(gpDs*cpDs)+(gpCs*cpCs)+(gpCgm*cpCgm);
                gpa = productCreditGrade/sumCredit;

                tvResult.setText("Your Gpa is "+gpa);

                Toast.makeText(MainActivity.this,"Gpa is"+gpa,Toast.LENGTH_LONG).show();
            }
        });

    }

    private int gradePoint(String number){

        if(!number.equals("")) {

            int marks = Integer.valueOf(number);

            if (marks >= 90 && marks <= 100)
                return 10;
            if (marks >= 75 && marks <= 89)
                return 9;
            if (marks >= 65 && marks <= 74)
                return 8;
            if (marks >= 55 && marks <= 64)
                return 7;
            if (marks >= 50 && marks <= 54)
                return 6;
            if (marks >= 45 && marks <= 49)
                return 5;
            if (marks >= 40 && marks <= 44)
                return 4;
            if (marks < 40)
                return 0;
        }

        return 0;

    }
}
