package com.utad.textosiguiendocurva;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.view.View;

public class PizarraView extends View {
	private Paint paint;
	private Path path;
	
	public PizarraView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		paint = new Paint();
		path = new Path();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		canvas.drawColor(Color.WHITE);
		
		paint.setTextSize(60);
		paint.setAntiAlias(true);
		
		int width = getWidth();
		
		paint.setColor(Color.RED);
		paint.setStyle(Paint.Style.STROKE);
		
		Direction dir = Direction.CW;
		float radio = 100;
		path.addCircle(width/2, 200, radio, dir);
		path.offset(0, 0);
		
		canvas.drawPath(path, paint);

		paint.setColor(Color.BLACK);
		float hOffset = 0;
		float vOffset = -20;
		//El par�metro vOffset define la distancia vertical del texto (perpendicular a la curva)
		//El par�metro hOffset define la distancia horizontal del texto (a lo largo) al origen de la curva.
		//Este m�todo nos da total control sobre la direcci�n que sigue un texto.
		canvas.drawTextOnPath("Texto en Path externo", path, hOffset, vOffset, paint);
		
		paint.setStyle(Paint.Style.FILL);
		paint.setTextSize(20);
		hOffset = 100;
		vOffset = 20;
		canvas.drawTextOnPath("Texto interior comenzando a " + hOffset + " del punto inicial", path, hOffset, vOffset, paint);
	}

}
