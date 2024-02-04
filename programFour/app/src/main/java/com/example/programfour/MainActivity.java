package com.example.programfour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    fragmentOne fragmentOne=new fragmentOne();
    fragmentTwo fragmentTwo=new fragmentTwo();

    int num=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=findViewById(R.id.button);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.c, fragmentOne);
        num = 1;
        fragmentTransaction.commit();


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager1=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction1=fragmentManager1.beginTransaction();
                if(num==1){
                    fragmentTransaction1.replace(R.id.c,fragmentTwo);
                    num=2;
                }
                else{
                    fragmentTransaction1.replace(R.id.c,fragmentOne);
                    num=1;
                }
                fragmentTransaction1.commit();
            }
        });
    }




}