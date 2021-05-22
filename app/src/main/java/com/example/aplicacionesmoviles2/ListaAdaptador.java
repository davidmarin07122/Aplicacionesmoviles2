package com.example.aplicacionesmoviles2;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListaAdaptador extends RecyclerView.Adapter<ListaAdaptador.viewHolder> {

    ArrayList <Actividad> listaDatos;

    public ListaAdaptador(ArrayList<Actividad> listaDatos) {
        this.listaDatos = listaDatos;

    }

    @NonNull
    @Override
    public ListaAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vistaDeItemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemdelista,parent, false);

        return new viewHolder(vistaDeItemLista);

    }

    @Override
    public void onBindViewHolder(@NonNull ListaAdaptador.viewHolder holder, int position) {
        holder.actualizarDatos(listaDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoActividad;
        TextView nombreactividad;

        public viewHolder(@NonNull View itemView) {

            super(itemView);

            fotoActividad= itemView.findViewById(R.id.firtsimagen);
            nombreactividad = itemView.findViewById(R.id.titulo);
        }

        public void actualizarDatos(final Actividad actividad) {
            fotoActividad.setImageResource(actividad.getImageActividad());
            nombreactividad.setText(actividad.getNombreActividad());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent( itemView.getContext(),MainActivity.class);
                    intent.putExtra("datosActividad",actividad);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }
}
