package com.utad.animaciondrawable;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends Activity {
	private AnimationDrawable animacion;
	private ImageView imagen;
	private TextView tv;
	private double ratio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        imagen = (ImageView)findViewById(R.id.imageView1);
        tv = (TextView)findViewById(R.id.textView1);
        
        imagen.setVisibility(ImageView.VISIBLE);
        
        animacion = (AnimationDrawable) getResources().getDrawable(R.drawable.fotogramas_animados);
        imagen.setImageDrawable(animacion);
        
        //Se calcula la relaci�n de aspecto de la primer fotograma.
        Drawable imagen1 = getResources().getDrawable(R.drawable.mascota01);
        
        int width = imagen1.getIntrinsicWidth();
        int height = imagen1.getIntrinsicHeight();
        ratio = height / (width + 0.01);
        tv.setText("imagen1 width= " + width + ", height=" + height+ 
        		   ", ratio =" + ratio);
        
        //Se calcula la anchura y la altura que tiene el ImageView en la pantalla
        width = imagen.getMeasuredWidth();
        height = imagen.getMeasuredHeight();
        tv.append("\nimage width= " + width + ", height=" + height);
    }


    public void comenzar(View view){ 
    	//Calculamos las dimensiones del ImageView aqu� para que no sean 0

        animacion.start();
    }
    
    public void detener(View view){
    	animacion.stop();
    }
}
