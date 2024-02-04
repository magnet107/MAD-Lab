package com.example.programthree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText name,mobile;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        submit = findViewById(R.id.submitBtn);
        name = findViewById(R.id.nameEditText);
        mobile = findViewById(R.id.MobileEditText);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n =name.getText().toString();
                String m = mobile.getText().toString();
                Intent intent = new Intent(MainActivity.this, activity2.class);

                intent.putExtra("nameuser", n);

                intent.putExtra("mobileuser",m);

                startActivity(intent);



            }
        });

    }
}