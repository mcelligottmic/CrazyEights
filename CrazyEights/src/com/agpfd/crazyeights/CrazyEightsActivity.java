package com.agpfd.crazyeights;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class CrazyEightsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TitleView tView = new TitleView(this);
		tView.setKeepScreenOn(true);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags
			(WindowManager.LayoutParams.FLAG_FULLSCREEN,
			WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//setContentView(R.layout.activity_crazy_eights);
		setContentView(tView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.crazy_eights, menu);
		return true;
	}

}
