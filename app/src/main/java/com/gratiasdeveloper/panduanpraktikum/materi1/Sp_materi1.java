package com.gratiasdeveloper.panduanpraktikum.materi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.gratiasdeveloper.panduanpraktikum.R;

public class Sp_materi1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp_materi1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Sp_materi1.this, Bagian1_m1.class));
                finish();
            }
        },2000);
    }
}