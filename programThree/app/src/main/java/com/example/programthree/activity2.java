package com.example.programthree;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity2 extends AppCompatActivity {

    TextView nameTextView, mobileTextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);


        nameTextView =findViewById(R.id.nameEditText);
        mobileTextView=findViewById(R.id.MobileEditText);

        String username= getIntent().getStringExtra("nameuser");
        String usermobile = getIntent().getStringExtra("mobileuser");

        nameTextView.setText(username);
        mobileTextView.setText(usermobile);


    }
}
