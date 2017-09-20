package com.example.mgodoy.layout;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Adapter;

import com.example.mgodoy.layout.Adapter.itemRecycleAdaptertarea;

import java.util.ArrayList;
import java.util.List;

public class Activity_tarea extends AppCompatActivity {

    private RecyclerView recview;
    private itemRecycleAdaptertarea tarea;
    private Context cont ;
    private ArrayList<imagen> Lisimg;
    private imagen img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       cont=this;

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Lisimg.add(new imagen(R.drawable.thumbnail_calculator,getResources().getString(R.string.cbx_calculator)));

                tarea= new itemRecycleAdaptertarea(cont,Lisimg);
                recview.setAdapter(tarea);


            }
        });
        inicialisarcomponentes();
    }

    public void inicialisarcomponentes (){

        recview= (RecyclerView) findViewById(R.id.rec_tarea);

        GridLayoutManager glm = new  GridLayoutManager(cont,3);
        recview.setLayoutManager(glm);

        Lisimg= new ArrayList<>();

        Lisimg.add(new imagen(R.drawable.thumbnail_atm,getResources().getString(R.string.cbx_atm)));
        Lisimg.add(new imagen(R.drawable.thumbnail_bag,getResources().getString(R.string.cbx_bag)));
        Lisimg.add(new imagen(R.drawable.thumbnail_basket,getResources().getString(R.string.cbx_basquet)));
        Lisimg.add(new imagen(R.drawable.thumbnail_box,getResources().getString(R.string.cbx_box)));
        Lisimg.add(new imagen(R.drawable.thumbnail_briefcase,getResources().getString(R.string.cbx_briefcase)));
        Lisimg.add(new imagen(R.drawable.thumbnail_calculator,getResources().getString(R.string.cbx_calculator)));

        tarea= new itemRecycleAdaptertarea(cont,Lisimg);
        recview.setAdapter(tarea);



    }

}
