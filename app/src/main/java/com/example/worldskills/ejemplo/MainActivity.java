package com.example.worldskills.ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.webkit.WebView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> lista;
    RecyclerView recycler;
    AdapterLista adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     /*   for(int i=0;i<25;i++){
            lista.add("#"+i);
        }
        recycler= findViewById(R.id.contenedor);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adaptador=new AdapterLista(lista);
        recycler.setAdapter(adaptador);
        */
    }
}
