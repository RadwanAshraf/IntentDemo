package com.radwan_pc.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

        Button button;
        EditText editText;
        Student student;
        Person person;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.B_SecActivity);
        editText=findViewById(R.id.edit_text);
        student=new Student("Ahmed","CS",2012512182,390.5);
        person=new Person("Mai","Student",20);

        //use intent to start Second Activity by explicit intent

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(getApplicationContext(),SecondActivity.class);

                //pass simple value
                intent.putExtra("key",editText.getText().toString());


                //pass  Serializable Object
                intent.putExtra("student",student);


                //pass Parcelable Object
                intent.putExtra("person",person);

                startActivity(intent);

            }
        });

        }
}
