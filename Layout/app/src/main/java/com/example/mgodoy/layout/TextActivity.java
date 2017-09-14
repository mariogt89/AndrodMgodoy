package com.example.mgodoy.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TextActivity extends AppCompatActivity {


    private EditText etingresado;
    private TextView tvmostrar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        intcomponente();
    }

    private void  intcomponente(){
        etingresado= (EditText) findViewById(R.id.Ed_insert_text);
        tvmostrar=(TextView) findViewById(R.id.tv_result);
    }

    public void readText(View view){
        String text=etingresado.getText().toString();
        if((text !=null)&&(!text.trim().isEmpty())){
            tvmostrar.setText(text);

        }else {
                    tvmostrar.setText("");
            Toast.makeText(this,getString(R.string.msj_empty_text),Toast.LENGTH_LONG).show();
        }
}

}
