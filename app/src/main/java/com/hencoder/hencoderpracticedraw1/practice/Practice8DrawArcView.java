package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

	public Practice8DrawArcView(Context context) {
		super(context);
	}

	public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

		int width = getMeasuredWidth() / 2;
		int height = getMeasuredHeight() / 2;

		RectF oval = new RectF(width - 400, height - 200, width + 400, height + 200);
		Paint paint = new Paint();
		paint.setAntiAlias(true);
		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeWidth(4);
		paint.setStrokeCap(Paint.Cap.ROUND);
		canvas.drawArc(oval, -175, 45, false, paint);


		Paint paint1 = new Paint();
		paint1.setAntiAlias(true);
		paint1.setStyle(Paint.Style.FILL);
		canvas.drawArc(oval, -120, 100, true, paint1);


		Paint paint2 = new Paint();
		paint2.setAntiAlias(true);
		paint2.setStyle(Paint.Style.FILL);
		canvas.drawArc(oval, 25, 125, false, paint2);

	}
}
