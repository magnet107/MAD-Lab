package com.example.programfive;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String username,password;
    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=findViewById(R.id.btn1);
        Button b2=findViewById(R.id.btn2);
        EditText usr=findViewById(R.id.txt1);
        EditText pwd=findViewById(R.id.txt2);
        database=new Database(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username=usr.getText().toString();
                password=pwd.getText().toString();
                boolean result=database.insertData(username,password);
                if(result==true){
                    Toast.makeText(getApplicationContext(), "Registration is done", Toast.LENGTH_SHORT).show();
                    Log.i("result","Registration Completed");
                }
                else {
                    Toast.makeText(MainActivity.this, "Registeration Failed", Toast.LENGTH_SHORT).show();
                    Log.i("result","Resistration Failed");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = usr.getText().toString();
                password = pwd.getText().toString();
                boolean cr=database.getData(username,password);
                if(cr==true){
                    Toast.makeText(getApplicationContext(),"login successful",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "login failed",Toast
                            .LENGTH_SHORT).show();
                }
            }
        });
        


    }
}