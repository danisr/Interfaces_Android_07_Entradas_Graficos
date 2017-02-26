package com.utad.curvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
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

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        paint.setAntiAlias(true);

        int width = getMeasuredWidth();
        int height = getMeasuredHeight();

        path.moveTo(0, 0);
        for (int i = 1; i < width; i++){
            path.lineTo(i, (float) Math.sin(i/20f)*(-50f));
        }

//Para trasladar la curva
        path.offset(0, 100);
        canvas.drawPath(path, paint);

        float[] intervalos1 = {10, 10};
        DashPathEffect dash1 = new DashPathEffect(intervalos1, 1);
//Para dibujar con distintos estilos de l�nea:
//discontinua, puntos y trazos, puntos,etc
        paint.setPathEffect(dash1);
        path.offset(0, 100);
        canvas.drawPath(path, paint);

        float[] intervalos2 = {10, 10, 2, 10};
        DashPathEffect dash2 = new DashPathEffect(intervalos2, 0);
        paint.setPathEffect(dash2);
        path.offset(0, 100);
        canvas.drawPath(path, paint);

        float[] intervalos3 = {2, 4};
        DashPathEffect dash3 = new DashPathEffect(intervalos3, 0);
//Para dibujar con distintos estilos de l�nea:
//discontinua, puntos y trazos, puntos,etc
        paint.setPathEffect(dash3);
        path.offset(0, 100);
        canvas.drawPath(path, paint);
    }

}