package com.example.mgodoy.proyectoandroid.holder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.mgodoy.proyectoandroid.Activity.EncuestaClienteActivity;
import com.example.mgodoy.proyectoandroid.R;
import com.example.mgodoy.proyectoandroid.clases.MostrarUsuario;

/**
 * Created by mgodoy on 28/09/2017.
 */




public class HolderMostraCliente extends RecyclerView.ViewHolder {

    private ImageView imagen;
    private TextView txtCliente;
    private TextView txtDireccion;
    private TextView txtTelefono;
    private RelativeLayout relativeLayout;
    private TextView txtresultado;
    Context context;
    private MostrarUsuario mostrarUsuario;



    public HolderMostraCliente(View itemView) {
        super(itemView);

        imagen=itemView.findViewById(R.id.ImgView);
        txtCliente=itemView.findViewById(R.id.txtcliente);
        txtDireccion=itemView.findViewById(R.id.txtdireccion);
        txtTelefono=itemView.findViewById(R.id.txttelefono);
        relativeLayout=itemView.findViewById(R.id.Relamostrar);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((EncuestaClienteActivity)context).CambiarPantalla(mostrarUsuario);
            }
        });


    }

    public void SetInformacion (MostrarUsuario MostUsuario, Context context){
mostrarUsuario=MostUsuario;
        txtCliente.setText(MostUsuario.getCliente());
        txtDireccion.setText(MostUsuario.getDireccion());
        txtTelefono.setText(MostUsuario.getTelefono());
        this.context=context;

    }
}
