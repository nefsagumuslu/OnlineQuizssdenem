package com.example.onlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    TextView textView;
    ImageView imageView4;
    Button buton1, button2, buton3, kayitbuton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        textView=findViewById(R.id.textView);
        buton1=findViewById(R.id.buton1);
        button2=findViewById(R.id.button2);
        buton3=findViewById(R.id.buton3);
        imageView4=findViewById(R.id.imageView4);

    buton1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            gecisyap2();
        }
    });

    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            gecisyap3();
        }
    });

    buton3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            gecisyap4();
        }
    });

    }
    public void gecisyap2()
    {
        Intent acivity3=new Intent(this,activity3.class);
        startActivity(acivity3);
    }

    public void gecisyap3()
    {
        Intent activity4=new Intent(this,activity4.class);
        startActivity(activity4);
    }

    public void gecisyap4()
    {
        Intent activitykayit=new Intent(this,activitykayit.class);
        startActivity(activitykayit);
    }

}
