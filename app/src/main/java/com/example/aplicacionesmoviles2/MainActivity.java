package com.example.aplicacionesmoviles2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Actividad actividad;
    ImageView imagenActividad;
    TextView descripcion, nombreactivad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagenActividad = findViewById(R.id.imagen1);
        descripcion = findViewById(R.id.descripcion);



        actividad=(Actividad) getIntent().getSerializableExtra("datosActividad");

        imagenActividad.setImageResource(actividad.getImageActividad());
        descripcion.setText(actividad.getDescripcion());

    }
}