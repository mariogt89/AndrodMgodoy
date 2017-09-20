package com.example.mgodoy.layout.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mgodoy.layout.Holder.itemholder;
import com.example.mgodoy.layout.R;

/**
 * Created by mgodoy on 19/09/2017.
 */

public class itemRecycleAdapter extends RecyclerView.Adapter<itemholder> {

    private  int[] imageResour;
    private  String[] label;
    private Context context;




    @Override
    public itemholder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflat=  LayoutInflater.from(context);

        View view =inflat.inflate(R.layout.itemholder,parent,false);

        return new itemholder(view);
    }

    @Override
    public void onBindViewHolder(itemholder holder, int position) {

        holder.setData(imageResour [position],label[position]);

    }

    @Override
    public int getItemCount() {
        return label.length;
    }

    public itemRecycleAdapter(int[] imageResour, String[] label, Context context) {
        this.imageResour = imageResour;
        this.label = label;
        this.context = context;
    }


}
