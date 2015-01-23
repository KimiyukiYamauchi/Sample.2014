package com.example.sample;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;

public class SampleView3 extends View {
	private Bitmap bmp;

	// コンストラクタ
	public SampleView3(Context context) {
		super(context);
		setBackgroundColor(Color.WHITE);
		Resources res = context.getResources();
		bmp = BitmapFactory.decodeResource(res, R.drawable.cat);
	}

	// 描画の必要が生じた時に呼び出される
	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawBitmap(bmp, 0, 0, null);
	}
}
