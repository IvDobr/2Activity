package com.sinigr.twoactivity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void secondActivity(View v){
		Intent intent = new Intent(this, SecondActivity.class);
	      startActivity(intent);
	}
	@Override
	protected void onResume() {
		Log.d("mainLog", "Возобновление первого Activity после закрытия второго");
		super.onResume();
	}
}


