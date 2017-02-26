package com.utad.pintartexto;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.view.View;

public class PizarraView extends View {
	private Paint paint;

	public PizarraView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		paint = new Paint();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);


		paint.setColor(Color.WHITE);
		canvas.drawPaint(paint);

		int width = canvas.getWidth();
		int height = canvas.getHeight();
		paint.setTextSize(30);
		paint.setAntiAlias(true);

		paint.setColor(Color.rgb(0, 100, 20));
		canvas.drawLine(width/2, 0, width/2, height, paint);

		paint.setColor(Color.BLACK);
		paint.setTextAlign(Align.RIGHT);
		canvas.drawText("Align.RIGHT", width/2, 160, paint);
		paint.setTextAlign(Align.CENTER);
		canvas.drawText("Align.CENTER", width/2, 120, paint);
		paint.setTextAlign(Align.LEFT);
		canvas.drawText("Align.LEFT", width/2, 80, paint);

		paint.setTextSkewX(0.2f);
		canvas.drawText("SkewX 0.2", 20, 210, paint);
		paint.setTextSkewX(-0.2f);
		canvas.drawText("SkewX -0.2", width/2, 210, paint);

		paint.setTextScaleX(2f);
		canvas.drawText("TextScaleX 2", 10, 250, paint);
		paint.setTextScaleX(-2f);
		canvas.drawText("TextScaleX -2", width, 290, paint);
		paint.setTextSize(60);
		paint.setTextScaleX(0.5f);
		canvas.drawText("TextScaleX 0.5", width/2, 360, paint);
		paint.setTextScaleX(1f);
		paint.setTextSize(30);

		paint.setTypeface(Typeface.SANS_SERIF);
		canvas.drawText("Sans serif", 20, 330, paint);
		paint.setTypeface(Typeface.DEFAULT_BOLD);
		canvas.drawText("Default bold", 20, 370, paint);
		paint.setTypeface(Typeface.MONOSPACE);
		canvas.drawText("Monospace", 20, 410, paint);
		paint.setTypeface(Typeface.SERIF);
		canvas.drawText("Serif", 20, 450, paint);
		paint.setTypeface(Typeface.DEFAULT);

		paint.setTextSize(50);
		paint.setAntiAlias(false);
		canvas.drawText("Antialias false", 20, 500, paint);
		paint.setAntiAlias(true);
		canvas.drawText("Antialias true", 20, 550, paint);
	}

}
