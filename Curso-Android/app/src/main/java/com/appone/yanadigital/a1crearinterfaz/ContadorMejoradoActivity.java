package com.appone.yanadigital.a1crearinterfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContadorMejoradoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador_mejorado);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
