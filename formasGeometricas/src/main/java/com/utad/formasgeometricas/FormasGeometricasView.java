package com.utad.formasgeometricas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class FormasGeometricasView extends View {
	private Paint paint;

	public FormasGeometricasView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		paint = new Paint();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);

		int bottom = getBottom();
		int right = getRight();
		canvas.drawColor(Color.WHITE);

		paint.setAntiAlias(true);
		paint.setStyle(Paint.Style.FILL);
		paint.setColor(Color.RED);
		canvas.drawCircle(50, 50, 30, paint);
		canvas.drawRect(150, 50, 200, 100, paint);
		paint.setColor(Color.BLUE);
		canvas.drawCircle(50, 100, 30, paint);
		canvas.drawRect(150, 150, 200, 200, paint);
		paint.setColor(Color.GREEN);
		canvas.drawCircle(50, 150, 30, paint);
		canvas.drawRect(150, 250, 200, 300, paint);
		paint.setColor(Color.MAGENTA);
		canvas.drawCircle(50, 200, 30, paint);
		canvas.drawRect(150, 350, 200, 400, paint);

		paint.setColor(Color.BLACK);
		paint.setStyle(Paint.Style.STROKE);
		canvas.drawCircle(50, 50, 30, paint);
		canvas.drawCircle(50, 100, 30, paint);
		canvas.drawCircle(50, 150, 30, paint);
		canvas.drawCircle(50, 200, 30, paint);

		canvas.drawRect(150, 50, 200, 100, paint);
		paint.setStrokeWidth(2);
		canvas.drawRect(150, 150, 200, 200, paint);
		paint.setStrokeWidth(4);
		canvas.drawRect(150, 250, 200, 300, paint);
		paint.setStrokeWidth(6);
		canvas.drawRect(150, 350, 200, 400, paint);

		canvas.drawRect(10, 10, right-10, bottom-10, paint);

	}
}
