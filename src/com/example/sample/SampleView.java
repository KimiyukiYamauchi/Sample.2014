package com.example.sample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;

public class SampleView extends View {
	private Paint paint = new Paint();

	// �R���X�g���N�^
	public SampleView(Context context) {
		super(context);
		setBackgroundColor(Color.WHITE);
	}

	// �`��̕K�v�����������ɌĂяo�����
	@Override
	protected void onDraw(Canvas canvas) {
/*		paint.setTextSize(80);
		paint.setColor(Color.CYAN);
//		paint.setTypeface(Typeface.DEFAULT_BOLD);
		paint.setFakeBoldText(true);
		paint.setTextSkewX(-0.25f);
		canvas.drawText("����ɂ��́A���E�I", 50, 300, paint);*/
		
		paint.setTextSize(60);
		
		paint.setColor(Color.rgb(255, 255, 0));
		canvas.drawText("Hello!�͂�[", 0, 100, paint);
		
		paint.setTypeface(Typeface.DEFAULT_BOLD);
		paint.setColor(Color.argb(255, 255, 0, 0));
		canvas.drawText("Hello!�͂�[", 20, 160, paint);
		
		paint.setFakeBoldText(true);
		paint.setColor(Color.rgb(80, 80, 80));
		canvas.drawText("Hello!�͂�[", 40, 220, paint);
		
		paint.setTextSkewX(-0.25f);
		paint.setColor(Color.rgb(80, 80, 255));
		canvas.drawText("Hello!�͂�[", 60, 280, paint);
	}
}
