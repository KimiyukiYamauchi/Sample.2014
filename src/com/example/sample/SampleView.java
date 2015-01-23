package com.example.sample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;

public class SampleView extends View {
	private Paint paint = new Paint();

	// コンストラクタ
	public SampleView(Context context) {
		super(context);
		setBackgroundColor(Color.WHITE);
	}

	// 描画の必要が生じた時に呼び出される
	@Override
	protected void onDraw(Canvas canvas) {
/*		paint.setTextSize(80);
		paint.setColor(Color.CYAN);
//		paint.setTypeface(Typeface.DEFAULT_BOLD);
		paint.setFakeBoldText(true);
		paint.setTextSkewX(-0.25f);
		canvas.drawText("こんにちは、世界！", 50, 300, paint);*/
		
		paint.setTextSize(60);
		
		paint.setColor(Color.rgb(255, 255, 0));
		canvas.drawText("Hello!はろー", 0, 100, paint);
		
		paint.setTypeface(Typeface.DEFAULT_BOLD);
		paint.setColor(Color.argb(255, 255, 0, 0));
		canvas.drawText("Hello!はろー", 20, 160, paint);
		
		paint.setFakeBoldText(true);
		paint.setColor(Color.rgb(80, 80, 80));
		canvas.drawText("Hello!はろー", 40, 220, paint);
		
		paint.setTextSkewX(-0.25f);
		paint.setColor(Color.rgb(80, 80, 255));
		canvas.drawText("Hello!はろー", 60, 280, paint);
	}
}
