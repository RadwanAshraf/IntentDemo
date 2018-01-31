package com.radwan_pc.intentdemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        Button button;
        EditText editText;
        Student student;
        Person person;
        TextView sharedPreftextView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.B_SecActivity);
        editText=findViewById(R.id.edit_text);
        sharedPreftextView=findViewById(R.id.tV_SharedPref);
        student=new Student("Ahmed","CS",2012512182,390.5);
        person=new Person("Mai","Student",20);


        //get the Last Message from SharedPreference

           SharedPreferences sharedPreferences=getSharedPreferences("mySharedPref",MODE_PRIVATE);

           sharedPreftextView.setText(sharedPreferences.getString("myMessage","...").toString());

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



                //save the Message to SharedPreference

                SharedPreferences sharedPreferences=getSharedPreferences("mySharedPref",MODE_PRIVATE);

                SharedPreferences.Editor editor=sharedPreferences.edit();

                editor.putString("myMessage",editText.getText().toString());

                editor.apply();


            }
        });

        }


    @Override
    protected void onRestart() {

        //get the Last Message from SharedPreference

        SharedPreferences sharedPreferences=getSharedPreferences("mySharedPref",MODE_PRIVATE);

        sharedPreftextView.setText(sharedPreferences.getString("myMessage","...").toString());

        super.onRestart();
    }
}
