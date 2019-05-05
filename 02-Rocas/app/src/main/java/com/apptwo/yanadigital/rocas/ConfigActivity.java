package com.apptwo.yanadigital.rocas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ConfigActivity extends AppCompatActivity {

    @BindView(R.id.tx_barra)
    TextView txBarra;
    private ConfigActivity mContext;
    private Toolbar mToolbar;
    @BindView(R.id.item_back)
    ImageView itemBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        ButterKnife.bind(this);
        mContext = this;
        mToolbar = (Toolbar) findViewById(R.id.tool_bar);
        txBarra.setText("Configuración");
        setSupportActionBar(mToolbar);

    }

    @OnClick(R.id.item_back)
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.item_back:
                mContext.onBackPressed();
                finish();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
