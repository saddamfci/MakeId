//here's my app's email layout activity code
package com.roxy.myapp;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Gmail extends Activity {
	TextView htmlTextView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gmail);
		htmlTextView = (TextView) findViewById(R.id.TextViewGmail);
		Typeface tf = Typeface.createFromAsset(getAssets(), "g.ttf");// for font
																		// selection
		htmlTextView.setTypeface(tf);
		htmlTextView.setText(Html.fromHtml(getString(R.string.gmail)));
	}

}
