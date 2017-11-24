package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice6DrawLineView extends View {

	public Practice6DrawLineView(Context context) {
		super(context);
	}

	public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

//        练习内容：使用 canvas.drawLine() 方法画直线

		int width = getMeasuredWidth() / 2;
		int height = getMeasuredHeight() / 2;
		int xb = width / 2;
		int yb = height / 2;

		int xs = 3 * xb;
		int ys = yb * 3;

		Paint paint = new Paint();
		paint.setStrokeWidth(19);
		paint.setStrokeCap(Paint.Cap.BUTT);
		canvas.drawLine(xb, yb, xs, ys, paint);

		paint.setStrokeCap(Paint.Cap.ROUND);
		canvas.drawLine(xb - 200, yb , xs - 200, ys , paint);
		paint.setStrokeCap(Paint.Cap.SQUARE);

		canvas.drawLine(xb + 200, yb , xs + 200, ys , paint);
	}
}
