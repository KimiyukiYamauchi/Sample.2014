package com.example.sample;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;

public class SampleView5 extends View 
	implements OnGestureListener
{
	private Paint paint = new Paint();
	private GestureDetector gesdet;
	private ArrayList<String> status = new ArrayList<String>();

	// コンストラクタ
	public SampleView5(Context context) {
		super(context);
		setBackgroundColor(Color.WHITE);
		gesdet = new GestureDetector(context, this);
		setFocusable(true);
	}

	// 描画の必要が生じた時に呼び出される
	@Override
	protected void onDraw(Canvas canvas) {
		paint.setAntiAlias(true);
		paint.setTextSize(50);
		for(int i=0; i<Math.min(10, status.size()); i++){
			canvas.drawText(status.get(i), 0, 40+i*50, paint);
		}
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		gesdet.onTouchEvent(event);
		return true;
	}

	@Override
	public boolean onDown(MotionEvent e) {
		status.add(0, "onDown");
		invalidate();
		return false;
	}

	@Override
	public void onShowPress(MotionEvent e) {
		status.add(0, "onShowPress");
		invalidate();
		
	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		status.add(0, "onSingleTapUp");
		invalidate();
		return false;
	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float dx, float dy) {
		status.add(0, "onScroll dx=" + dx + " dy=" + dy);
		invalidate();
		return false;
	}

	@Override
	public void onLongPress(MotionEvent e) {
		status.add(0, "onLongPress");
		invalidate();
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float vx, float vy) {
		status.add(0, "onFling dx=" + vx + " dy=" + vy);
		invalidate();
		return false;
	}
	
	
}
