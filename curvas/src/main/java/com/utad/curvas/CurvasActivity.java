package com.utad.curvas;

import android.app.Activity;
import android.os.Bundle;

public class CurvasActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_curvas);
		PizarraView view = new PizarraView(this);
		setContentView(view);
	}
}
