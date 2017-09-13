package com.example.toshiba.f2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Soal3 extends AppCompatActivity {

    int Skor3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal3);

        Intent intent = getIntent();
        Bundle sk = intent.getExtras();

        Skor3 = sk.getInt("Skor2") ;
    }

    public void benar(View view){
        Intent intent = new Intent(Soal3.this, Soal4.class);
        intent.putExtra("Skor3", Skor3 + 10);
        startActivity(intent);
    }

    public void salah(View view){
        Intent intent = new Intent(Soal3.this, Soal4.class);
        intent.putExtra("Skor3", Skor3 + 0);
        startActivity(intent);
    }
}
