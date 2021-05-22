package com.example.aplicacionesmoviles2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    ArrayList<Actividad> listaActividades = new ArrayList<>();

    RecyclerView ListadoGrafico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ListadoGrafico= findViewById(R.id.listado);
        ListadoGrafico.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

    crearLista();
    ListaAdaptador adaptador = new ListaAdaptador(listaActividades);
    ListadoGrafico.setAdapter(adaptador);

    }
    private void crearLista(){

        listaActividades.add(new Actividad("EXPLORA",getString(R.string.descripcion1),R.drawable.jardincueva));

        listaActividades.add(new Actividad("GASTRONOMIA",getString(R.string.descripcion2),R.drawable.comida));

        listaActividades.add(new Actividad("RECORRE",getString(R.string.descripcion3), R.drawable.teleferico));

        listaActividades.add(new Actividad("HOSPEDAJE",getString(R.string.descripcion4),R.drawable.hotel));


    }
}