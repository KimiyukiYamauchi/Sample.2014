package com.example.sample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;

public class SampleView2 extends View {
	private Paint paint = new Paint();
	private Path path = new Path();
	private Rect rect = new Rect(5, 5, 200, 300);
	private RectF rect2 = new RectF(30, 90, 200, 300);

	// �R���X�g���N�^
	public SampleView2(Context context) {
		super(context);
		setBackgroundColor(Color.WHITE);
	}

	// �`��̕K�v�����������ɌĂяo�����
	@Override
	protected void onDraw(Canvas canvas) {
		paint.setAntiAlias(true);	// �����Ȃ߂炩�ɂȂ�
		paint.setStyle(Paint.Style.STROKE); // �h��Ԃ��Ȃ��ŁA�������\��
		paint.setStrokeWidth(10);	// ���̑���
		canvas.drawLine(10, 20, 100, 300, paint);
		paint.setColor(Color.RED);
		path.moveTo(30, 60);
		path.lineTo(60, 50);
		path.lineTo(90, 100);
		canvas.drawPath(path, paint);
		paint.setColor(Color.GREEN);
//		canvas.drawRect(5, 5, 105, 150, paint);
		canvas.drawRect(rect, paint);
		paint.setColor(Color.BLUE);
		canvas.drawCircle(50, 110, 30, paint);
		paint.setColor(Color.YELLOW);
		paint.setStyle(Paint.Style.FILL);
		canvas.drawArc(rect2, 30F, 120F, true, paint);
	}
}
