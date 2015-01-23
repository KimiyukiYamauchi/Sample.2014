package com.example.sample;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;

public class SampleView4 extends View {
	private Paint paint = new Paint();
	private ArrayList<PointF> points = new ArrayList<PointF>();

	// コンストラクタ
	public SampleView4(Context context) {
		super(context);
		setBackgroundColor(Color.WHITE);
		setFocusable(true);
	}

	// 描画の必要が生じた時に呼び出される
	@Override
	protected void onDraw(Canvas canvas) {
		paint.setAntiAlias(true);
		paint.setStyle(Paint.Style.FILL);
		
		for(int i=0; i<points.size(); i++){
			canvas.drawCircle(points.get(i).x, points.get(i).y, 6, paint);
		}
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		int action = event.getAction();
		if((action & MotionEvent.ACTION_MASK) == MotionEvent.ACTION_DOWN){
			points.add(new PointF(event.getX(), event.getY()));
			invalidate(); // 再描画を実行する
		}
		return true;
	}
	
	
}
