//here's my app's splash activity code
package com.roxy.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity {// here splash class inherits the activity
										// class

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		Thread tr = new Thread() {
			public void run() {
				try {
					sleep(2000);
				} catch (Exception e) {
				} finally {
					Intent intent = new Intent(Splash.this, Main.class);
					startActivity(intent);
					finish();
				}
			}
		};
		tr.start();
	}

}
