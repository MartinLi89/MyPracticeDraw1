package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

	public Practice2DrawCircleView(Context context) {
		super(context);
	}

	public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}


	int width;
	int height;


	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		width = getMeasuredWidth();
		height = getMeasuredHeight();
//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
		draw1(canvas);
		draw2(canvas);
		draw3(canvas);
		draw4(canvas);

	}

	private void draw4(Canvas canvas) {

		int x = width * 3 / 4;
		int y = height * 3 / 4;
		int r =180;
		if (r < 0) {
			r = 0;
		}
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeWidth(30);
		canvas.drawCircle(x, y, r, paint);


	}

	private void draw3(Canvas canvas) {
		float x = width / 4;
		float y = height / 4;
		y = height - y;
		float r = Math.min(x, y) - 100;
		if (r < 0) {
			r = 0;
		}
		Paint paint = new Paint();
		paint.setColor(Color.parseColor("#0000ff"));
		paint.setStyle(Paint.Style.FILL);

		canvas.drawCircle(x, y, r, paint);


	}

	private void draw2(Canvas canvas) {
		float x = width / 4;
		float y = height / 4;
		x = width - x;
		float r = Math.min(x, y);
		r -= 30;
		if (r < 0) {
			r = 0;
		}

		Paint paint = new Paint();
		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeWidth(5);

		canvas.drawCircle(x, y, r, paint);
	}

	private void draw1(Canvas canvas) {
		float x = width / 4;
		float y = height / 4;

		float r = Math.min(x, y);
		r -= 30;
		if (r < 0) {
			r = 0;
		}

		canvas.drawCircle(x, y, r, new Paint());
	}
}
