package com.example.practema01animframe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private ImageView imagen;
    private AnimationDrawable animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.btn_1);
        imagen=(ImageView)findViewById(R.id.img);

        if(imagen==null) throw new AssertionError();
        imagen.setBackgroundResource(R.drawable.animationframe);

        imagen.setVisibility(View.VISIBLE);

        animacion=(AnimationDrawable)imagen.getBackground();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!animacion.isRunning()){
                    animacion.start();
                    b1.setText("Detener");
                }else{
                    animacion.stop();
                    b1.setText("Despegar");
                }
            }
        });
    }
}