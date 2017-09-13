package com.example.toshiba.f2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Soal5 extends AppCompatActivity {

    int Skor5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal5);

        Intent intent = getIntent();
        Bundle sk = intent.getExtras();

        Skor5 = sk.getInt("Skor4") ;
    }

    public void benar(View view){
        Intent intent = new Intent(Soal5.this, Skor.class);
        intent.putExtra("Skor5", Skor5 + 10);
        startActivity(intent);
    }

    public void salah(View view){
        Intent intent = new Intent(Soal5.this, Skor.class);
        intent.putExtra("Skor5", Skor5 + 0);
        startActivity(intent);
    }
}
