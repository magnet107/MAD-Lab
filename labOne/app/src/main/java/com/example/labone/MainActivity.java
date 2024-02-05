package com.example.labone;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private LinearLayout widgetContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        widgetContainer = findViewById(R.id.widgetContainer);

        Button buttonNormal = findViewById(R.id.buttonNormal);
        Button buttonPressed = findViewById(R.id.buttonPressed);

        buttonNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.normalimage);
            }
        });

        buttonPressed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.pressedimage);
            }
        });

        // Add a TextView widget at runtime
        TextView dynamicTextView = new TextView(this);
        dynamicTextView.setText("Dynamic Widget Text");
        dynamicTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        widgetContainer.addView(dynamicTextView);
    }
}


