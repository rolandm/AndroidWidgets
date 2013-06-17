package com.example.pointlesswidget;

import java.util.Random;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.widget.RemoteViews;
import android.content.Context;
import android.widget.Toast;

public class PointlessWidget extends AppWidgetProvider {
	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		super.onUpdate(context, appWidgetManager, appWidgetIds);
		String rand = String.valueOf(new Random().nextInt(10));
		
		RemoteViews v = new RemoteViews(context.getPackageName(), R.layout.widget);
		for (int widgetId : appWidgetIds) {
			v.setTextViewText(R.id.tvWidgetUpdate, rand);
			appWidgetManager.updateAppWidget(widgetId, v);
		}
			}

	@Override
	public void onDeleted(Context context, int[] appWidgetIds) {
		super.onDeleted(context, appWidgetIds);
		Toast.makeText(context, "see you", Toast.LENGTH_SHORT).show();
	}

}
