package com.apptwo.yanadigital.enviodatosactivity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText1;
    private EditText mEditText2;
    private Button mBtnSumar;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=this;
        mEditText1=(EditText)findViewById(R.id.edNum1);
        mEditText2=(EditText)findViewById(R.id.edNum2);
        mBtnSumar=(Button) findViewById(R.id.btn_Enviar);

        mBtnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent= new Intent(mContext,SecondActivity.class);
                    //Enviar datos
                    intent.putExtra("numero1",Integer.parseInt(mEditText1.getText().toString()));
                    intent.putExtra("numero2",Integer.parseInt(mEditText2.getText().toString()));
                    startActivity(intent);

                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(mContext,"Error",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
