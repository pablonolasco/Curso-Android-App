package com.appone.yanadigital.a1crearinterfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        //this -> se le pasa el contexto en el que esta
        //Context -> Activit -> AppCompact
        TextView textView= new TextView(this);
        textView.setText("Hola alumnos");
        //colocar el la vista actual el text; vista que visualizara la actividad
        setContentView(textView);
    }
}
