package com.sinigr.twoactivity;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}
	protected void onStart() {
		Log.d("mainLog", "Старт второго Activity");
		super.onStart();
	}
	protected void onResume() {
		Log.d("mainLog", "Возобновление второго Activity");
		super.onResume();
	}
	protected void onPause() {
		Log.d("mainLog", "Сворачивание второго Activity");
		super.onPause();
	}
	protected void onDestroy() {
		Log.d("mainLog", "Закрытие второго Activity");
		super.onDestroy();
	}
	public void onBackPressed() {
		Log.d("mainLog", "Нажатие кнопки 'назад'");
		SecondActivity.this.finish();
	}
	 protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.d("mainLog", "onSaveInstanceState второго Activity");
	}
	 protected void onRestoreInstanceState(Bundle savedInstanceState) {
		 super.onRestoreInstanceState(savedInstanceState);
		 Log.d("mainLog", "onRestoreInstanceState второго Activity");
	}
}

