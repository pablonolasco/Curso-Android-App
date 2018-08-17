package com.appone.yanadigital.a1crearinterfaz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtnSum;
    private Button mBtnRes;
    private Button mBtnRest;
    private Button mBtnLinear;
    private TextView mTxResultado;
    private static int  sContador;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this -> se le pasa el contexto en el que esta
        //Context -> Activit -> AppCompact
       // TextView textView= new TextView(this);
        //textView.setText("Hola alumnos");
        //colocar el la vista actual el text; vista que visualizara la actividad
        //setContentView(textView);
        context=this;
        ++sContador;
        mBtnSum=(Button)findViewById(R.id.btnIncrement);
        mBtnRes=(Button)findViewById(R.id.btnRestar);
        mBtnRest=(Button)findViewById(R.id.btnReset);
        mBtnLinear=(Button)findViewById(R.id.btnLinear);
        mTxResultado=(TextView)findViewById(R.id.txMas);
        mTxResultado.setText(String.valueOf(sContador));
        mBtnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTxResultado.setText(String.valueOf(++sContador));
            }
        });

        mBtnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(sContador==0)) mTxResultado.setText(String.valueOf(--sContador));
            }
        });

        mBtnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sContador=0;
                mTxResultado.setText(String.valueOf(sContador));
            }
        });

        mBtnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,ContadorInterfazCursoActivity.class);
                startActivity(intent);
            }
        });
    }


}
