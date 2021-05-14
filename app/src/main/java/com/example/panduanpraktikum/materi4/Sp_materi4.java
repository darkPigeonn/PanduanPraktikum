package com.example.panduanpraktikum.materi4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.panduanpraktikum.R;
import com.example.panduanpraktikum.materi2.Bagian1_m2;
import com.example.panduanpraktikum.materi2.Sp_materi2;

public class Sp_materi4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp_materi4);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Sp_materi4.this, Bagian1_m4.class));
                finish();
            }
        },4000);
    }
}