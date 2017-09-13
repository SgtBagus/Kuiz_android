package com.example.toshiba.f2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Skor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        Intent intent = getIntent();
        Bundle sk = intent.getExtras();

        TextView skor;
        int Skor = sk.getInt("Skor5") ;

        skor = (TextView)findViewById(R.id.skor);
        skor.setText(""+Skor);

    }
}
