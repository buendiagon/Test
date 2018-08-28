package com.example.worldskills.ejemplo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterLista extends RecyclerView.Adapter<AdapterLista.listViewHolder> {
    ArrayList<String> lista;

    public AdapterLista(ArrayList<String> lista) {
    }

    @NonNull
    @Override
    public AdapterLista.listViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list,viewGroup,false);
        return new listViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterLista.listViewHolder listViewHolder, int i) {
        listViewHolder.palabra.setText(lista.get(i));

    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
    class listViewHolder extends RecyclerView.ViewHolder {
        TextView palabra;
        public listViewHolder(@NonNull View itemView) {
            super(itemView);
            palabra=itemView.findViewById(R.id.palabra);
        }
    }
}
