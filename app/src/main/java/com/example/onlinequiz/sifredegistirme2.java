package com.example.onlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sifredegistirme2 extends AppCompatActivity {
    TextView texta, texta2, text3;
    EditText editText, editText2;
    Button butonsifre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifredegistirme2);
        texta = findViewById(R.id.texta);
        texta2 = findViewById(R.id.texta2);
        text3 = findViewById(R.id.text3);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        butonsifre = findViewById(R.id.butonsifre);

        butonsifre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });


    }
    public void showToast() {

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.sifredeg2,(ViewGroup) findViewById(R.id.toast_root));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }
}
