package com.example.mgodoy.layout;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.mgodoy.layout.Adapter.itemRecycleAdapter;

public class activityClass extends AppCompatActivity {

    private RecyclerView rec_view;
    private itemRecycleAdapter item ;
    private Context cont ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cont = this;
        InicialisarComponentes();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


        public void InicialisarComponentes (){
        rec_view= (RecyclerView) findViewById(R.id.ViewRec);

            GridLayoutManager glm = new  GridLayoutManager(cont,3);
            rec_view.setLayoutManager(glm);

            int[] img = new int[]{R.drawable.thumbnail_atm,R.drawable.thumbnail_bag,R.drawable.thumbnail_basket,R.drawable.thumbnail_box
            ,R.drawable.thumbnail_briefcase,R.drawable.thumbnail_calculator};

            String []  text = new String[] {getResources().getString(R.string.cbx_atm),getResources().getString(R.string.cbx_bag),
                    getResources().getString(R.string.cbx_basquet),getResources().getString(R.string.cbx_box),getResources().getString(R.string.cbx_briefcase)
            ,getResources().getString(R.string.cbx_calculator)};

            item=new itemRecycleAdapter(img,text,cont);

            rec_view.setAdapter(item);

    }

}
