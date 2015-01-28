package com.example.sample;

import java.util.ArrayList;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;

public class SampleView6 extends View 
{
	private Paint paint = new Paint();

	// コンストラクタ
	public SampleView6(Context context) {
		super(context);
		setBackgroundColor(Color.WHITE);
		setFocusable(true);
		setFocusableInTouchMode(true);
	}

	// 描画の必要が生じた時に呼び出される
	@Override
	protected void onDraw(Canvas canvas) {
		paint.setAntiAlias(true);
		paint.setTextSize(50);
		paint.setColor(Color.BLACK);
		canvas.drawText("Touch", getWidth()/2-50, getHeight()/4, paint);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		int action = event.getAction();
		if((action & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_UP){
			DialogInterface.OnClickListener listener =
					new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dlg, int which) {
							if(which == DialogInterface.BUTTON_POSITIVE){
								AlertDialog.Builder ad =
										new AlertDialog.Builder(getContext());
								ad.setTitle("Notice");
								ad.setMessage("Go!");
								ad.setPositiveButton("OK", null);
								ad.show();
							}else if(which == DialogInterface.BUTTON_NEGATIVE){
							}
							
						}
					};
					AlertDialog.Builder alertdlg =
							new AlertDialog.Builder(getContext());
					alertdlg.setTitle("Notice");
					alertdlg.setMessage("Are you ready?");
					alertdlg.setPositiveButton("Yes", listener);
					alertdlg.setNegativeButton("No", listener);
					alertdlg.show();
		}
		return true;
	}

	
	
}
