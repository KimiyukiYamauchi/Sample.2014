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

	// �R���X�g���N�^
	public SampleView4(Context context) {
		super(context);
		setBackgroundColor(Color.WHITE);
		setFocusable(true);
	}

	// �`��̕K�v�����������ɌĂяo�����
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
			invalidate(); // �ĕ`������s����
		}
		return true;
	}
	
	
}
