package com.example.numerical_table_gen;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText3);
        textView = findViewById(R.id.textView);
        textView = findViewById(R.id.textView2);
        textView = findViewById(R.id.textView3);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                int a = Integer.parseInt(s);
                int c;
                for (c=0; c>11; c++){
                    textView.setText(a+"X"+c+"=c*a");
                }


            }
        });


    }
}