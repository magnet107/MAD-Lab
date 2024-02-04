package com.example.three;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText send=findViewById(R.id.send);
        Button btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=send.getText().toString();
                Intent i=new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("msg",str);
                startActivity(i);
            }
        });

    }
}