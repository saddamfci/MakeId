//here's my app's main layout activity code
package com.roxy.myapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

@SuppressLint("CutPasteId")
public class Main extends Activity {// main class inherits the activity class
	Button emailButton;
	Button facebookButton;
	Button skypeButton;
	Button twitterButton;
	Button instagrButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		emailButton = (Button) findViewById(R.id.email);
		Typeface tf = Typeface.createFromAsset(getAssets(), "g.ttf");// for font
																		// selection
		emailButton.setTypeface(tf);

		emailButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

			}
		});

		emailButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Main.this, Email.class);
				startActivity(intent);
			}
		});

		facebookButton = (Button) findViewById(R.id.facebook);
		facebookButton.setTypeface(tf);// for font select
		facebookButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Main.this, Facebook.class);
				startActivity(intent);

			}
		});

		skypeButton = (Button) findViewById(R.id.skype);
		skypeButton.setTypeface(tf);
		skypeButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Main.this, Skype.class);
				startActivity(intent);

			}
		});

		twitterButton = (Button) findViewById(R.id.twitter);
		twitterButton.setTypeface(tf);
		twitterButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Main.this, Twitter.class);
				startActivity(intent);

			}
		});

		instagrButton = (Button) findViewById(R.id.instagram);
		instagrButton.setTypeface(tf);
		instagrButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent intent = new Intent(Main.this, Instagram.class);
				startActivity(intent);

			}
		});

	}

}
