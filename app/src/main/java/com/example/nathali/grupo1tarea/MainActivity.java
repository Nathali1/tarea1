package com.example.nathali.grupo1tarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    private String[] datos = new String[6];
    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = (TextView) findViewById(R.id.lblMessage);
        for (int i=1; i<=6; i++){
            datos[i-1] = "Imagen: " + i;
        }

        gridView = (GridView) findViewById(R.id.gridView);

        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                message.setText("Seleccionada: " + datos[position]);
            }
        });
    }


}
