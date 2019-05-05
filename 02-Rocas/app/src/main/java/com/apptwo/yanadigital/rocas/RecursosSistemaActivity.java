package com.apptwo.yanadigital.rocas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class RecursosSistemaActivity extends AppCompatActivity {
    private ImageView mImageView;
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recursos_sistema);
        mImageView=(ImageView)findViewById(R.id.img_recurso);
        mImageView.setImageResource(android.R.drawable.ic_dialog_info);
        mTextView=(TextView)findViewById(R.id.tx_mensaje);
        mTextView.setText(android.R.string.autofill);
    }
}
