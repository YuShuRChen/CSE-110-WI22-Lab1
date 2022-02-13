package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name_text = findViewById(R.id.name);

        final Button show_name_button = findViewById(R.id.show_name_button);
        show_name_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                name_text.setVisibility(View.VISIBLE);
            }
        });

        final Button hide_name_button = findViewById(R.id.hide_name_button);
        hide_name_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                name_text.setVisibility(View.INVISIBLE);
            }
        });
    }
}