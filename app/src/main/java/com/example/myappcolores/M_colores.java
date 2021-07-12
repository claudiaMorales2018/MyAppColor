package com.example.myappcolores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class M_colores extends AppCompatActivity {

        TextView textView;
       RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcolores);

    textView = findViewById(R.id.txtColorHexa);
    relativeLayout = findViewById(R.id.relative1);

    this.datos();

    }

    private void datos () {
        Bundle bundle = getIntent().getExtras();
        String hexa = bundle.getString("hexa");
         int color = bundle.getInt("color");

         textView.setText(String.valueOf(hexa));
         relativeLayout.setBackgroundColor(color);

    }
}