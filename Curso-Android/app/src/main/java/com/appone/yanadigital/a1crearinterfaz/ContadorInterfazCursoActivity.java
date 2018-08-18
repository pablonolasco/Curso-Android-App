package com.appone.yanadigital.a1crearinterfaz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ContadorInterfazCursoActivity extends AppCompatActivity {
    private Button mBtnSum;
    private Button mBtnRes;
    private Button mBtnRest;
    private TextView mTxResultado;
    private static int  sContador;
    private Context mContext;
    private CheckBox mChStatus;
    private EditText mResetNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador_interfaz_curso);
        mContext=this;
        ++sContador;
        mBtnSum=(Button)findViewById(R.id.btnIncrement);
        mBtnRes=(Button)findViewById(R.id.btnRestar);
        mBtnRest=(Button)findViewById(R.id.btnReset);
        mTxResultado=(TextView)findViewById(R.id.txMas);
        mResetNumber=(EditText)findViewById(R.id.ed_Reset);
        mChStatus=(CheckBox)findViewById(R.id.ch_Status);
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

                if (mChStatus.isChecked()){

                    mTxResultado.setText(String.valueOf(--sContador));
                }else{
                    if(!(sContador <= 0))  mTxResultado.setText(String.valueOf(--sContador));
                }

            }
        });

        mBtnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero=Integer.parseInt(mResetNumber.getText().toString());
                sContador-=numero;
                mTxResultado.setText(String.valueOf(sContador));
            }
        });




    }
}
