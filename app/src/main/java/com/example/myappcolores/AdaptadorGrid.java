package com.example.myappcolores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorGrid extends BaseAdapter {

    Context context;
    int referencia;
    ArrayList<String> colorN = new ArrayList<>();
    ArrayList<Integer> color = new ArrayList<>();

    public AdaptadorGrid(Context context, int referencia, ArrayList<String> colorN, ArrayList<Integer> color) {
        this.context = context;
        this.referencia = referencia;
        this.colorN = colorN;
        this.color = color;
    }

    @Override
    public int getCount() {
        return this.colorN.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater layoutInflater= LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.grid_personalizado,null);


        String nombre = this.colorN.get(position);
        TextView texto = v.findViewById(R.id.txtColor);


        int color = this.color.get(position);
        RelativeLayout relativeLayout= v.findViewById(R.id.relativeColor);

        texto.setText(String.valueOf(nombre));
        relativeLayout.setBackgroundColor(color);


        return v;
    }
}
