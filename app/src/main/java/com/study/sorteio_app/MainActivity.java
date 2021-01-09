package com.study.sorteio_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sorteio(View view){
        TextView texto = findViewById(R.id.texto);
        int x = new Random().nextInt(1000);
        texto.setText("x: "+x);
    }
}