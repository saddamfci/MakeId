//here's my app's email layout activity code
package com.roxy.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Email extends Activity {
	Button gmailButton;
	Button yahooButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_email);

		gmailButton = (Button) findViewById(R.id.gmail);
		gmailButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Email.this, Gmail.class);
				startActivity(intent);

			}
		});
		yahooButton = (Button) findViewById(R.id.yahoo);
		yahooButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Email.this, Yahoo.class);
				startActivity(intent);
			}
		});

	}

}
