package com.example.onlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sifre extends AppCompatActivity {
    TextView textView4, text10;
    EditText editText;
    Button butonsifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifre);

        textView4 = findViewById(R.id.textView4);
        text10 = findViewById(R.id.text10);
        editText = findViewById(R.id.editText);
        butonsifre = findViewById(R.id.butonsifre);
    }

}
