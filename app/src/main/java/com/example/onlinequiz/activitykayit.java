package com.example.onlinequiz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class activitykayit extends AppCompatActivity {

    TextView kayittext, kayittext1, kayittext2, kayittext3, kayittext4,
            kayittext5, kayittext6;
    private Button kayitbuton;
    EditText k1, k2, k3, k4, k5, k6;
    //FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitykayit);

        Init();

      // auth = FirebaseAuth.getInstance();
        kayitbuton.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {

                String email = k4.getText().toString();
                String pass = k5.getText().toString();
                if(!email.equals("") && !pass.equals("")){

                    k4.setText("");
                    k5.setText("");
                    kayitol(email,pass);
                }else
                    {
                    Toast.makeText(getApplicationContext(), "Bilgileri boş giremezsiniz.",Toast.LENGTH_LONG).show();
                }

            }
        });

        if(k1.getText().toString().trim().length() == 12)
            k1.setError("Bu alanı boş geçemezsiniz." +
                        "Şifre uzunluğu 11 karakter olmalıdır!");
        else
            k1.setError(null);
        k2 = findViewById(R.id.k2);
        if(k2.getText().toString().trim().length() == 0)
            k2.setError("Bu alanı boş geçemezsiniz!");
        else
            k2.setError(null);
        k3 = findViewById(R.id.k3);
        if(k3.getText().toString().trim().length() == 0)
            k3.setError("Bu alanı boş geçemezsiniz!");
        else
            k3.setError(null);
        k4 = findViewById(R.id.k4);
        if(k4.getText().toString().trim().length() == 0)
            k4.setError("Bu alanı boş geçemezsiniz!");
        else
            k4.setError(null);
        k5 = findViewById(R.id.k5);
        if(k5.getText().toString().trim().length() == 0)
            k5.setError("Bu alanı boş geçemezsiniz!");
        else
            k5.setError(null);
        k6 = findViewById(R.id.k6);
        if(k6.getText().toString().trim().length() == 0)
            k6.setError("Bu alanı boş geçemezsiniz!");
        else
            k6.setError(null);


        kayitbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });
    }
    public void showToast() {

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.kayit_toast,(ViewGroup) findViewById(R.id.toast_root));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

    }
    public void kayitol(String email, String pass)
    {
       /* auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                  Intent intent = new Intent(activitykayit.this,activity2.class);
                    startActivity(intent);
                    finish();
                }else
                {
                    Toast.makeText(getApplicationContext(), "Kayıt olma esnasında bir problem yaşandı", Toast.LENGTH_LONG).show();
                }
            }
        });*/
    }
    private void Init(){
        kayittext = findViewById(R.id.kayittext);
        kayittext1 = findViewById(R.id.kayittext1);
        kayittext2 = findViewById(R.id.kayittext2);
        kayittext3 = findViewById(R.id.kayittext3);
        kayittext4 = findViewById(R.id.kayittext4);
        kayittext5 = findViewById(R.id.kayittext5);
        kayittext6 = findViewById(R.id.kayittext6);
        k1 = findViewById(R.id.k1);
        kayitbuton = findViewById(R.id.kayitbuton);
    }
}

