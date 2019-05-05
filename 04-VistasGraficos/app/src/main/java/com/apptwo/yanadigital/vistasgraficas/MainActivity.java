package com.apptwo.yanadigital.vistasgraficas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(new PropiaVista(this));
    }

    public class PropiaVista extends View{

        public PropiaVista(Context context) {
            super(context);
        }

        protected  void onDraw(Canvas canvas){
            /*Paint pincel= new Paint();
           // paint.setColor(Color.BLUE);
            int color=ContextCompat.getColor(getContext(),R.color.colorAccent);
            pincel.setColor(color);
            pincel.setStrokeWidth(8);//anchura del pincel
            pincel.setStyle(Paint.Style.FILL_AND_STROKE); //Stroke -> dibujo, fill -> Relleno
            //dibujar el circulo, x, y y radio
            canvas.drawCircle(175,175,100,pincel);
            */
            Path miTrazo = new Path();
            //coordenadas x, y
            miTrazo.addCircle(350,350,200,Path.Direction.CCW);
            Paint paint= new Paint();
            paint.setColor(Color.RED);
            paint.setStrokeWidth(8);//grosor
            paint.setStyle(Paint.Style.STROKE);//relleno
            canvas.drawPath(miTrazo,paint);
            paint.setStrokeWidth(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setTextSize(40);
            paint.setTypeface(Typeface.SERIF);//tipo de letra

            canvas.drawTextOnPath("hola",miTrazo,40,40,paint);
        }




    }
}
