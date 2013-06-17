package com.example.pointlesswidget;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.appwidget.AppWidgetManager;
import android.content.Intent;

public class WidgetConfigActivity extends Activity implements OnClickListener {
	EditText info;
	AppWidgetManager awm;
	Context ctx;
	int awId;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.widget_config);
		Button b = (Button)findViewById(R.id.bwidgetconfig);
		b.setOnClickListener(this);
		ctx = WidgetConfigActivity.this;
		info = (EditText)findViewById(R.id.etwidgetconfig);

		// getting widget which started this activity
		Intent intent = getIntent();
		Bundle extras = intent.getExtras();
		if (extras != null) {
			awId = extras.getInt(
				AppWidgetManager.EXTRA_APPWIDGET_ID,
				AppWidgetManager.INVALID_APPWIDGET_ID);
		}
	}
	public void onClick(View v) {

	}
}
