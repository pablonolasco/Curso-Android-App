package com.appone.yanadigital.a1crearinterfaz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
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
                resetNumero();

            }
        });

        /**
         * Metodo para realizar el resetNumero el teclado al presionar la flecha en el teclado
         */

        mResetNumber.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if(i == EditorInfo.IME_ACTION_DONE){
                        resetNumero();
                }
                return false;
            }
        });




    }

    public void resetNumero(){

        //Almacenar la opcion de entrada, en este caso es el teclado
        InputMethodManager manager= (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);


        String valor=mResetNumber.getText().toString().trim();
        if (!(valor.equals("") || valor.length() <=0)){
            int numero = Integer.parseInt(mResetNumber.getText().toString());

            if(!(numero<=0)) {
                sContador -= numero;
                mTxResultado.setText(String.valueOf(sContador));
                mResetNumber.setText("");

            }
        }else{
            Toast.makeText(mContext,"Campo Vacio",Toast.LENGTH_SHORT).show();
            mResetNumber.setFocusable(true);
        }
        //Ocultar el teclado al dar clic en el boton reset
         manager.hideSoftInputFromWindow(mResetNumber.getWindowToken(),0);


    }


/*
    @Override
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

        if(textView.getId()== R.id.ed_Reset){
            Toast.makeText(mContext,"entro",Toast.LENGTH_SHORT);
            if(i == EditorInfo.IME_ACTION_DONE){

                resetNumero();

            }
        }


        return false;
    }*/
}
