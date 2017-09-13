package com.example.toshiba.f2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Soal2 extends AppCompatActivity {

    int Skor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);

        Intent intent = getIntent();
        Bundle sk = intent.getExtras();

        Skor2 = sk.getInt("Skor") ;
    }

    public void benar(View view){
        Intent intent = new Intent(Soal2.this, Soal3.class);
        intent.putExtra("Skor2", Skor2 + 10);
        startActivity(intent);
    }

    public void salah(View view){
        Intent intent = new Intent(Soal2.this, Soal3.class);
        intent.putExtra("Skor2", Skor2 + 0);
        startActivity(intent);
    }
}
