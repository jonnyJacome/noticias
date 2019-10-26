package com.example.noticias;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

class adaptadorNoticias extends ArrayAdapter<Noticias> {
    public adaptadorNoticias(Context context, Noticias[] datos) {
        super(context, R.layout.noticas, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.noticas, null);
        TextView lblTitulo = (TextView)item.findViewById(R.id.txttitulo1);
        lblTitulo.setText(getItem(position).getTitulo());
        TextView lblSubtitulo = (TextView)item.findViewById(R.id.txttitulo2);
        lblSubtitulo.setText(getItem(position).getSubtitulo());
        return(item);
    }
}