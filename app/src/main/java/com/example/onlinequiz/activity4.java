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

public class activity4 extends AppCompatActivity {
    TextView ogrencigiristext, ogrencigiristc, ogrencigirissifre;
    Button button4, buton11;
    EditText editText1, editText2;
    ImageView imageViews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity4);

        ogrencigiristext=findViewById(R.id.ogrencigiristext);
        ogrencigiristc=findViewById(R.id.ogrencigiristc);
        ogrencigirissifre=findViewById(R.id.ogrencigirissifre);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button4=findViewById(R.id.button4);
        buton11=findViewById(R.id.buton11);
        imageViews=findViewById(R.id.imageViews);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });
        buton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                gecisyap6();
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
    public void gecisyap6()
    {
        Intent sifredegistirme2=new Intent(this,sifredegistirme2.class);
        startActivity(sifredegistirme2);
    }
}
