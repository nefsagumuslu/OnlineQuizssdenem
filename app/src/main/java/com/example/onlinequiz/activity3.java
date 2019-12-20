package com.example.onlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class activity3 extends AppCompatActivity {

    TextView textogretmen, textogrtc, textogrsifre;
    Button ogretmengirisb, buton10;
    ImageView prof;
    EditText text1, text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);

        textogretmen=findViewById(R.id.textogretmen);
        textogrtc=findViewById(R.id.textogrtc);
        textogrsifre=findViewById(R.id.textogrsifre);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        ogretmengirisb=findViewById(R.id.ogretmengirisb);
        buton10 = findViewById(R.id.buton10);
        prof=findViewById(R.id.prof);

        buton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                gecisyap5();
            }
        });


        ogretmengirisb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });
    }
    public void showToast() {

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.sifre_toast,(ViewGroup) findViewById(R.id.toast_root));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }

    public void gecisyap5()
    {
        Intent sifre=new Intent(this,sifre.class);
        startActivity(sifre);
    }

}
