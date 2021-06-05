package com.jalur.gunung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Loading extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.loading);
		Thread logoTimer = new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					sleep(5000);
					Intent i = new Intent(Loading.this, MainActivity.class);
					startActivity(i);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				finally{
					finish();
				}
			}
		};
		logoTimer.start();
	}
	
}