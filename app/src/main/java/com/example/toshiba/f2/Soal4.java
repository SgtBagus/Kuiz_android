package com.example.toshiba.f2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Soal4 extends AppCompatActivity {

    int Skor4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal4);

        Intent intent = getIntent();
        Bundle sk = intent.getExtras();

        Skor4 = sk.getInt("Skor3") ;
    }


    public void benar(View view){
        Intent intent = new Intent(Soal4.this, Soal5.class);
        intent.putExtra("Skor4", Skor4 + 10);
        startActivity(intent);
    }

    public void salah(View view){
        Intent intent = new Intent(Soal4.this, Soal5.class);
        intent.putExtra("Skor4", Skor4 + 0);
        startActivity(intent);
    }
}
