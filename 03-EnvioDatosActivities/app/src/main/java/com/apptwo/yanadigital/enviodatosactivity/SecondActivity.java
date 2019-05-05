package com.apptwo.yanadigital.enviodatosactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.apptwo.yanadigital.enviodatosactivity.Model.Suma;

public class SecondActivity extends AppCompatActivity {

    private Suma mSuma;
    private TextView mTextResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {

            mSuma= new Suma();
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);
            mTextResultado=(TextView)findViewById(R.id.txResultado);
            //Recibir los datos
            Bundle datos=getIntent().getExtras();
            mSuma.setmNumero1(datos.getInt("numero1"));
            mSuma.setmNumero2(datos.getInt("numero2"));
            //int resultado=mSuma.sumar();
           // mTextResultado.setText(String.valueOf(mSuma));
            mTextResultado.setText(String.valueOf(mSuma));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
