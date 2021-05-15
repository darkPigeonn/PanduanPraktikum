package com.example.panduanpraktikum.materi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.panduanpraktikum.MenuMateri;
import com.example.panduanpraktikum.R;
import com.example.panduanpraktikum.materi1.Bagian1_m1;
import com.example.panduanpraktikum.materi1.Bagian2_m1;
import com.example.panduanpraktikum.materi1.Bagian3_m1;
import com.example.panduanpraktikum.materi2.Bagian1_m2;

public class Bagian1_m3 extends AppCompatActivity {
    float x1,x2,y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagian1_m3);


        ImageButton home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bagian1_m3.this, MenuMateri.class));
                finish();
            }
        });
    }

    public boolean onTouchEvent(MotionEvent touchEvent) {

        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                //kanan
                if(x1 > x2){
//                    MediaPlayer mp = MediaPlayer.create(hal9_struktur_porifera.this,R.raw.sipe);
//                    mp.start();
                    Intent i = new Intent(Bagian1_m3.this, Bagian2_m3.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.slide_right,R.anim.slide_left_out);
                    finish();
                }
//                else if(x1 < x2){
//                    Intent i = new Intent(Bagian2_m1.this, Bagian1_m1.class);
//                    startActivity(i);
//                    overridePendingTransition(R.anim.slide_left,R.anim.slide_right_out);
//                    finish();
//                }
                break;
        }
        return false;
    }
}