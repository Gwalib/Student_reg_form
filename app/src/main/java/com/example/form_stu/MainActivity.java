package com.example.form_stu;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    EditText ename,eage;
    TextView dob;
    DatePickerDialog datePickerDialog;
    RadioGroup rg1,rg2; RadioButton radioButton,radiButton;
    Spinner spinner; Button button; ImageButton IB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ename=findViewById(R.id.txtname);
        eage=findViewById(R.id.txtage);
        dob=findViewById(R.id.txtdob);
        rg1=findViewById(R.id.butgrp);
        rg2=findViewById(R.id.butgrp2);
        button=findViewById(R.id.submit);

        IB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month= calendar.get(Calendar.MONTH);
                int day= calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog= new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int day, int month, int year) {
                        dob.setText(day + "/" + (+month + 1) + "/" + year);
                    }//ondate set ends here
                },year,month,day);
                     datePickerDialog.show();
                       }//onclick void ends here
        }//setonclick listner func ends here
        );//IB ends here



     Spinner spinner=findViewById((R.id.courses));
     ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.courses, android.R.layout.simple_spinner_item);
     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
     spinner.setAdapter(adapter);


     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {




         }
     }
     );


    }//OnCreate ends here

    public void checkButton(View view)
    {
        int radioId=rg1.getCheckedRadioButtonId();
        radioButton=findViewById(radioId);

        int radiId=rg2.getCheckedRadioButtonId();
        radiButton=findViewById(radiId);

    }

}//main act. ends here