package com.example.labprogramone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    ImageButton btn;
    Switch aSwitch;
    ConstraintLayout c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn=findViewById(R.id.b1);
        aSwitch=findViewById(R.id.switch1);
        c=findViewById(R.id.cl);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    btn.setEnabled(true);
                    aSwitch.setText("Enabled");

                }
                else{
                    btn.setEnabled(false);
                    aSwitch.setText("Disabled");
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Hello world",Snackbar.LENGTH_LONG).show();
            }
        });

        CalendarView cv=new CalendarView(getApplicationContext());
        ConstraintLayout.LayoutParams p=new ConstraintLayout.LayoutParams(
                ConstraintLayout.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );
        c.addView(cv,p);
    }
}