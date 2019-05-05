package com.apptwo.yanadigital.rocas;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_play)
    Button btnPlay;
    @BindView(R.id.btn_info)
    Button btnInfo;
    @BindView(R.id.btn_conf)
    Button btnConf;
    @BindView(R.id.btn_exit)
    Button btnExit;
    private MainActivity mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mContext=this;
    }

    /**
     *
     * MENÚ
     * Metodo que infla el menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity,menu);

        return super.onCreateOptionsMenu(menu);
    }


    /**
     * ITEM'S DEL MENÚ
     * Metodo que regresa las acciones del menú
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()){
            case R.id.item_config:
                 intent= new Intent(mContext,ConfigActivity.class);
                startActivity(intent);
                break;
            case R.id.item_info:
                 intent= new Intent(mContext,InfoActivity.class);
                startActivity(intent);
                break;
                default:
                    Toast.makeText(mContext,"No se eligio ningna opcion del menú",Toast.LENGTH_SHORT).show();
                    break;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick({R.id.btn_play, R.id.btn_info, R.id.btn_conf, R.id.btn_exit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_play:

                break;
            case R.id.btn_info:
                Intent intent= new Intent(this, InfoActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_conf:
                break;
            case R.id.btn_exit:
                break;
        }
    }
}
