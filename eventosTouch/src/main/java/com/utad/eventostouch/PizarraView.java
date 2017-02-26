package com.utad.eventostouch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class PizarraView extends View {
	private float x, y = 50;
	private String texto = "Evento";
	
	private Paint paint;

	public PizarraView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		paint = new Paint();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		//Coloreamos el canvas
		canvas.drawColor(Color.LTGRAY);
		
		//Configurar el lapiz
		paint.setAntiAlias(true);
		paint.setColor(Color.RED);
		
		//Pintamos un c�rculo
		canvas.drawCircle(x, y, 20, paint);
		
		//Configurar el lapiz
		paint.setColor(Color.BLACK);
		paint.setTextSize(35);
		
		//Pintamos texto
		canvas.drawText("x = " + x, 100, 50, paint);
		canvas.drawText("y = " + y, 100, 90, paint);
		canvas.drawText(texto, 100, 130, paint);
	}


	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		// Los valores de las coordenadas donde ha tenido lugar el evento
		// se obtienen ejecutando los m�todos getX() y getY() del objeto Event.
		x = event.getX();
		y = event.getY();
		//ACTION_DOWN - Tocamos la pantalla
		if (event.getAction() == MotionEvent.ACTION_DOWN){
			texto = "Action Down";
		}
		//ACTION_UP - Levantamos el dedo de la pantalla
		if (event.getAction() == MotionEvent.ACTION_UP){
			texto = "Action Up";
		}
		//ACTION_MOVE - Sigue el movimiento del dedo cuando se arrastra por la pantalla
		if (event.getAction() == MotionEvent.ACTION_MOVE) {
			texto = "Action Move";
		}
		
		// La pantalla debe volver a dibujarse cada vez que hay un evento.
		invalidate();
		
		return true;
	}	
}
