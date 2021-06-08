package com.gratiasdeveloper.panduanpraktikum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {
    Button pengantar,kikd,pp,df,profil,lkpd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        pengantar = findViewById(R.id.btn_pengantar);
        kikd = findViewById(R.id.btn_kikd);
        pp = findViewById(R.id.btn_panduanprak);
        df = findViewById(R.id.btn_dapus);
        profil = findViewById(R.id.btn_profil);
        lkpd = findViewById(R.id.btn_lkpd);

        pengantar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUtama.this,KataPengantar.class));
                
            }
        });


        kikd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUtama.this,KiKd.class));
               
            }
        });


        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUtama.this,MenuMateri.class));
            }
        });


        df.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUtama.this,DaftarPustaka.class));

            }
        });

        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuUtama.this,Profil.class));

            }
        });

        lkpd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mediafire.com/folder/rl9idjrjwcxdu/LKPD"));
                startActivity(implicit);
            }
        });
    }
}