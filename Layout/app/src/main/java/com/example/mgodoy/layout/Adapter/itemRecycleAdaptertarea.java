package com.example.mgodoy.layout.Adapter;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.mgodoy.layout.Holder.itemholdertarea;
import com.example.mgodoy.layout.R;
import com.example.mgodoy.layout.imagen;

import java.util.ArrayList;

/**
 * Created by mgodoy on 19/09/2017.
 */

public class itemRecycleAdaptertarea extends RecyclerView.Adapter<itemholdertarea> {
    private Context context;
    private ArrayList<imagen> imagesClass;



    public itemRecycleAdaptertarea(Context context, ArrayList<imagen> imagesClass) {
        this.context = context;
        this.imagesClass = imagesClass;
    }


    @Override
    public itemholdertarea onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(context);
        View view = li.inflate(R.layout.recycletarea, parent,false);
        return new itemholdertarea(view);
    }

    @Override
    public void onBindViewHolder(itemholdertarea holder, int position) {
        holder.setData(imagesClass.get(position).getImagen(),imagesClass.get(position).getNombre());
    }

    @Override
    public int getItemCount() {
        return imagesClass.size();
    }
}
