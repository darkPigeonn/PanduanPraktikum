package com.example.panduanpraktikum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.panduanpraktikum.materi1.Sp_materi1;
import com.example.panduanpraktikum.materi2.Sp_materi2;
import com.example.panduanpraktikum.materi3.sp_materi3;
import com.example.panduanpraktikum.materi4.Sp_materi4;
import com.example.panduanpraktikum.materi5.Sp_materi5;
import com.example.panduanpraktikum.materi6.Sp_materi6;

public class MenuMateri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_materi);

        Button ruanglingkup = findViewById(R.id.materi1);
        Button keanekaragam = findViewById(R.id.materi2);
        Button klasifikasi = findViewById(R.id.materi3);
        Button virus = findViewById(R.id.materi4);
        Button ekosistem = findViewById(R.id.materi5);
        Button perubahan = findViewById(R.id.materi6);

        Button home = findViewById(R.id.btnhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuMateri.this, MenuUtama.class));
                finish();
            }
        });
        ruanglingkup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuMateri.this, Sp_materi1.class));
            }
        });
        keanekaragam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuMateri.this, Sp_materi2.class));
            }
        });
        klasifikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuMateri.this, sp_materi3.class));
            }
        });
        virus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuMateri.this, Sp_materi4.class));
            }
        });
        ekosistem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuMateri.this, Sp_materi5.class));
            }
        });
        perubahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuMateri.this, Sp_materi6.class));
            }
        });
    }
}