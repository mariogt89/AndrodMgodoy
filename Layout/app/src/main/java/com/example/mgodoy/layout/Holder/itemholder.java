package com.example.mgodoy.layout.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mgodoy.layout.R;

import static android.R.attr.label;

/**
 * Created by mgodoy on 19/09/2017.
 */


public class itemholder extends RecyclerView.ViewHolder {

    private ImageView imgview;
    private TextView txtview;

    public itemholder(View itemView) {
        super(itemView);

        imgview =  itemView.findViewById(R.id.imageView3);
        txtview=  itemView.findViewById(R.id.txt_Ejemplo);


    }

    public void setData(int imageResour, String Label){
        imgview.setImageResource(imageResour);
        txtview.setText(Label);
    }

}
