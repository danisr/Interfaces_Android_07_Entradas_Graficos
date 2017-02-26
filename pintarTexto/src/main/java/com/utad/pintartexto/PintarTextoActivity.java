package com.utad.pintartexto;


import android.app.Activity;
import android.os.Bundle;

public class PintarTextoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		PizarraView view = new PizarraView(this);
		setContentView(view);
	}


}
