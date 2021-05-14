package com.example.panduanpraktikum.materi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.panduanpraktikum.R;
import com.example.panduanpraktikum.materi1.Bagian1_m1;
import com.example.panduanpraktikum.materi1.Sp_materi1;

public class Sp_materi2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp_materi2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Sp_materi2.this, Bagian1_m2.class));
                finish();
            }
        },4000);
    }
}