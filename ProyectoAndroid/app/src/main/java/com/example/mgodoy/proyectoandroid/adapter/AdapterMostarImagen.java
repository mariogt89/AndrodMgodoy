package com.example.mgodoy.proyectoandroid.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mgodoy.proyectoandroid.R;
import com.example.mgodoy.proyectoandroid.clases.MostraImagen;
import com.example.mgodoy.proyectoandroid.holder.HolderImagen;

import java.util.ArrayList;

/**
 * Created by mgodoy on 01/10/2017.
 */

public class AdapterMostarImagen extends RecyclerView.Adapter<HolderImagen> {

    private Context context;
    private ArrayList<MostraImagen> datos;

    public AdapterMostarImagen(Context context, ArrayList<MostraImagen> datos) {
        this.context = context;
        this.datos = datos;
    }

    @Override
    public HolderImagen onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(context);
        View view = li.inflate(R.layout.entimagen, parent, false);
        return new HolderImagen(view);
    }

    @Override
    public void onBindViewHolder(HolderImagen holder, int position) {
        holder.setDatos(datos.get(position).getUbicacion(), context);

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
        public void addNew(MostraImagen imagen){
            if(datos == null)
            {
                datos = new ArrayList<>();
            }
            datos.add(imagen);
            notifyItemInserted(datos.size() - 1);
        }

    }

