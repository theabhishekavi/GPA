package com.example.gpa;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstSemester extends AppCompatActivity {

    //Credit Score
    private int ctMaths = 4,ctFcs = 3,ctStld = 3,ctCs = 3,ctDs =1,ctCgm =2,
            ctChem1 =3;
    private int cpStld = 1, cpDs = 1, cpCs = 2, cpCgm = 2,
            cpFoc1 =1,cpChem1 =1;
    float gpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_semester);

        final EditText thMaths = findViewById(R.id.thMath3);
        final EditText thFcs = findViewById(R.id.thFcs3);
        final EditText thStld = findViewById(R.id.thStld3);
        final EditText thCs = findViewById(R.id.thCs3);
        final EditText thDs = findViewById(R.id.thDs3);
        final EditText thCgm = findViewById(R.id.thCgm3);
        final EditText thChem1 = findViewById(R.id.thChem1);

        final EditText pcStld = findViewById(R.id.pcStld3);
        final EditText pcDs = findViewById(R.id.pcDs3);
        final EditText pcCs = findViewById(R.id.pcCs3);
        final EditText pcCgm = findViewById(R.id.pcCgm3);
        final EditText pcFoc1 = findViewById(R.id.pcFoc1);
        final EditText pcChem1 = findViewById(R.id.pcChem1);

        final TextView tvThirdSem = findViewById(R.id.tvThirdSem);
        final TextView tvTheorySub3 = findViewById(R.id.tvTheorySub3);
        final TextView tvPract3 = findViewById(R.id.tvPractical3);
        final TextView tvResult = findViewById(R.id.tvResult);

        tvThirdSem.setPaintFlags(tvThirdSem.getPaintFlags()|
                Paint.UNDERLINE_TEXT_FLAG);
        tvTheorySub3.setPaintFlags(tvTheorySub3.getPaintFlags()|
                Paint.UNDERLINE_TEXT_FLAG);
        tvPract3.setPaintFlags(tvPract3.getPaintFlags()|
                Paint.UNDERLINE_TEXT_FLAG);


        Button btnOk = findViewById(R.id.btnOk);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //grade points acuired
                int gtMaths = gradePoint(thMaths.getText().toString());
                int gtFcs = gradePoint(thFcs.getText().toString());
                int gtStld = gradePoint(thStld.getText().toString());
                int gtCs = gradePoint(thCs.getText().toString());
                int gtDs = gradePoint(thDs.getText().toString());
                int gtCgm = gradePoint(thCgm.getText().toString());
                int gtChem1 = gradePoint(thChem1.getText().toString());

                int gpStld = gradePoint(pcStld.getText().toString());
                int gpDs = gradePoint(pcDs.getText().toString());
                int gpCs = gradePoint(pcCs.getText().toString());
                int gpCgm = gradePoint(pcCgm.getText().toString());
                int gpFoc1 = gradePoint(pcFoc1.getText().toString());
                int gpChem1 = gradePoint(pcChem1.getText().toString());

                float sumCredit = cpCgm+cpCs+cpDs+cpStld+cpFoc1+cpChem1
                        +ctCgm+ctCs+ctDs+ctFcs+ctMaths+ctStld+ctChem1;

                float productCreditGrade = (gtMaths*ctMaths)+(gtFcs*ctFcs)+
                        (gtStld*ctStld)+(gtCs*ctCs)+(gtDs*ctDs)+(gtCgm*ctCgm)+
                        (gpStld*cpStld)+(gpDs*cpDs)+(gpCs*cpCs)+(gpCgm*cpCgm)+
                        (gpFoc1*cpFoc1)+(gpChem1*cpChem1)+(gtChem1*cpChem1);
                gpa = productCreditGrade/sumCredit;

                tvResult.setText("Your Gpa is "+gpa);

                Toast.makeText(FirstSemester.this,"Gpa is"+gpa,Toast.LENGTH_LONG).show();
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
