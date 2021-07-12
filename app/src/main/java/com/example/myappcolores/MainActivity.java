package com.example.myappcolores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     GridView gridView;
     ArrayList<String> colorN = new ArrayList<>();
     ArrayList<Integer> color = new ArrayList<>();
     ArrayList<String> hexa = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridId);


        colorN.add("Amarillo");
        colorN.add("Verde");
        colorN.add("Salmon");
        colorN.add("Rosado");
        colorN.add("Anaranjado");
        colorN.add("Magenta");
        colorN.add("Azul");
        colorN.add("marron");
        colorN.add("Rojo");
        colorN.add("Aceituna");
        colorN.add("Violeta");
        colorN.add("Lima");


        color.add(Color.parseColor("#FFFF00"));
        color.add(Color.parseColor("#ADFF2F"));
        color.add(Color.parseColor("#FFA07A"));
        color.add(Color.parseColor("#FF69B4"));
        color.add(Color.parseColor("#FF8C00"));
        color.add(Color.parseColor("#FF00FF"));
        color.add(Color.parseColor("#0000FF"));
        color.add(Color.parseColor("#993333"));
        color.add(Color.parseColor("#FF0000"));
        color.add(Color.parseColor("#808000"));
        color.add(Color.parseColor("#C71585"));
        color.add(Color.parseColor("#00FF00"));


        hexa.add("#FFFF00");
        hexa.add("#ADFF2F");
        hexa.add("#FFA07A");
        hexa.add("#FF69B4");
        hexa.add("#FF8C00");
        hexa.add("#FF00FF");
        hexa.add("#0000FF");
        hexa.add("#993333");
        hexa.add("#FF0000");
        hexa.add("#808000");
        hexa.add("#C71585");
        hexa.add("#00FF00");


       AdaptadorGrid adaptadorGrid= new AdaptadorGrid( this,R.layout.grid_personalizado,colorN,color);
       gridView.setAdapter(adaptadorGrid);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),M_colores.class);
                intent.putExtra("color",color.get(position));
                intent.putExtra("hexa",hexa.get(position));

                startActivity(intent);


            }
        });
    }
}