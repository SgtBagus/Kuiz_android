package com.example.toshiba.f2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    int skor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void benar(View view){
        Intent intent = new Intent(MainActivity.this, Soal2.class);
        intent.putExtra("Skor",skor + 10);
        startActivity(intent);
    }

    public void salah(View view){
        Intent intent = new Intent(MainActivity.this, Soal2.class);
        intent.putExtra("Skor",skor + 0);
        startActivity(intent);
    }
}
