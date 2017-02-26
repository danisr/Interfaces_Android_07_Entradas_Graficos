package com.utad.formasgeometricas;

import android.app.Activity;
import android.os.Bundle;

public class FormasGeometricasActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FormasGeometricasView view = new FormasGeometricasView(this);
        setContentView(view);

    }

}
