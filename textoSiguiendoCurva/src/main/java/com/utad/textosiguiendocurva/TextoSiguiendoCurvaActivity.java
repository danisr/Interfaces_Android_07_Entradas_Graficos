package com.utad.textosiguiendocurva;

import android.app.Activity;
import android.os.Bundle;

public class TextoSiguiendoCurvaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_texto_siguiendo_curva);
		PizarraView view = new PizarraView(this);
		setContentView(view);
	}

}
