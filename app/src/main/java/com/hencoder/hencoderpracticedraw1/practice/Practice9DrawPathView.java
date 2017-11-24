package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

	public Practice9DrawPathView(Context context) {
		super(context);
	}

	public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

		int width = getMeasuredWidth() / 2;
		int height = getMeasuredHeight() / 2;


		int r = 50;
		int x1 = width - r;
		int y1 = height;


		int x2 = width + r;
		int y2 = height;


		Paint paint = new Paint();
		paint.setStyle(Paint.Style.FILL);
		paint.setStrokeWidth(4);
		Path path = new Path();

		RectF rectF = new RectF(x1 - r, y1 - r, x1 + r, y1 + r);
		path.addArc(rectF, 135, 225);//左边的圆
		RectF rectFRight = new RectF(x2 - r, y2 - r, x2 + r, y2 + r);
		path.arcTo(rectFRight, -180, 225, false);//右侧圆
		path.lineTo(width, height + 100);
		path.close();

		//不使用close 使用下面两句也可以做到一样的效果,疑似android 做了优化
//		path.moveTo(x1 - r, y1);
//		path.lineTo( width, height + 100);


		canvas.drawPath(path, paint);


	}
}
