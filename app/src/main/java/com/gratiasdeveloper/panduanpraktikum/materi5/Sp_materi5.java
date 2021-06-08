package com.gratiasdeveloper.panduanpraktikum.materi5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.gratiasdeveloper.panduanpraktikum.R;

public class Sp_materi5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp_materi5);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Sp_materi5.this, Bagian1_m5.class));
                finish();
            }
        },4000);
    }
}