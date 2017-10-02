package com.example.mgodoy.proyectoandroid.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mgodoy.proyectoandroid.R;
import com.example.mgodoy.proyectoandroid.clases.MostrarUsuario;
import com.example.mgodoy.proyectoandroid.holder.HolderMostraCliente;

import java.util.List;

/**
 * Created by mgodoy on 28/09/2017.
 */

public class AdapterMostraCliente extends RecyclerView.Adapter <HolderMostraCliente>{

    private Context context;
    private List <MostrarUsuario> listUsuario;

    public AdapterMostraCliente(Context context, List<MostrarUsuario> listUsuario) {
        this.context = context;
        this.listUsuario = listUsuario;
    }

    @Override
    public HolderMostraCliente onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutinflater = LayoutInflater.from(context);
        View view = layoutinflater.inflate(R.layout.entcliente,parent,false);

        return new HolderMostraCliente(view);
    }

    @Override
    public void onBindViewHolder(HolderMostraCliente holder, int position) {

        holder.SetInformacion(listUsuario.get(position),context);


    }

    @Override
    public int getItemCount() {
        return listUsuario.size();
    }
}
