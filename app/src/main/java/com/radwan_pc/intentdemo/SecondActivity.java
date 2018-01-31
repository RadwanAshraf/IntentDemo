package com.radwan_pc.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    TextView tVStud;
    TextView tVPer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView=findViewById(R.id.text_view);
        tVStud=findViewById(R.id.tV_Stud);
        tVPer=findViewById(R.id.tV_Person);


        ////you could use this directly
        //getIntent().getStringExtra("key").toString();

        Intent intent=getIntent();

        //set Message to textView
        textView.setText(intent.getStringExtra("key"));


        //set student Data to view

        Student student;
        student=(Student)getIntent().getSerializableExtra("student");

        tVStud.setText("Name : "+student.getStudName()+"\n"
                      +"Depart : "+student.getStudDepartment()+"\n"
                      +"ID : "+student.getStudID()+"\n"
                      +"Grade : "+student.getStudGrade()+"\n");


        //set person Data

        Person person;
        person =getIntent().getParcelableExtra("person");


        tVPer.setText("Name : "+person.getFirstName()+"\n"
                +"Job : "+person.getJob()+"\n"
                +"Age : "+person.getAge()+"\n");



    }
}
