package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

	public Practice10HistogramView(Context context) {
		super(context);
	}

	public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

		//绘制坐标系


		int x1 = 100;
		int y1 = 100;

		int x2 = x1;
		int y2 = y1 + 500;


		int x3 = x1 + 900;
		int y3 = y2;


		Paint paint = new Paint();
		paint.setStrokeWidth(2);
		paint.setStyle(Paint.Style.STROKE);
		paint.setColor(Color.parseColor("#ececec"));

		canvas.drawLine(x1, y1, x2, y2, paint);
		canvas.drawLine(x2, y2, x3, y3, paint);

		paint.setTextSize(30);
		int pianYiLiang = 30;
		String text = "原点";
		canvas.drawText(text, x2 - paint.measureText(text), y2 + pianYiLiang, paint);

		paint.setTextSize(80);
		paint.setStyle(Paint.Style.FILL);
		canvas.drawText("直方图", (x3 - x2) * 0.5f, y2 + 140, paint);
		yuandian = new Point(x2, y2, "原点");

		Paint paintChild = new Paint();
		paintChild.setColor(Color.parseColor("#00ff00"));
		paintChild.setStyle(Paint.Style.FILL);

		int jianju = (int) (bianchang * 1.2F);

		Point froyo = new Point(100, 10, "Froyo");
		drawChild(canvas, froyo, paintChild);

		Point gb = new Point(froyo.x + jianju, 20, "GB");
		drawChild(canvas, gb, paintChild);

		Point ics = new Point(gb.x + jianju, 20, "ICS");
		drawChild(canvas, ics, paintChild);

		Point jb = new Point(ics.x + jianju, 100, "JB");
		drawChild(canvas, jb, paintChild);

		Point kitKat = new Point(jb.x + jianju, 180, "KitKat");
		drawChild(canvas, kitKat, paintChild);


		Point l = new Point(kitKat.x + jianju, 200, "L");
		drawChild(canvas, l, paintChild);


		Point m = new Point(l.x + jianju, 140, "M");
		drawChild(canvas, m, paintChild);
	}

	Point yuandian;
	int bianchang = 80;

	private void drawChild(Canvas canvas, Point point, Paint paintChild) {


		RectF rect = new RectF(yuandian.x + point.x - bianchang * 0.5f,
				yuandian.y - point.y,
				yuandian.x + point.x + bianchang * 0.5f,
				yuandian.y);

		canvas.drawRect(rect, paintChild);

		drawText(canvas, yuandian.x + point.x, yuandian.y + 30, point);
	}


	Paint textDraw;

	private void drawText(Canvas canvas, int x, int y, Point point) {
		textDraw = new Paint();
		textDraw.setColor(Color.parseColor("#ececec"));
		textDraw.setTextSize(30);
		textDraw.setTextAlign(Paint.Align.CENTER);

		canvas.drawText(point.name, x, y, textDraw);
	}


	/**
	 * 描述坐标系中的某一点
	 */
	class Point {
		public int x;
		public int y;
		public String name;

		public Point(int x, int y, String name) {
			this.x = x;
			this.y = y;
			this.name = name;
		}
	}
}

