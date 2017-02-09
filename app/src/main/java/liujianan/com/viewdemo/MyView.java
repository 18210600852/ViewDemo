package liujianan.com.viewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by 刘嘉男
 * on 2017/2/9
 * 描述:
 */
public class MyView extends View {
    Paint paint;
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Cirle(canvas);
    }

    public void Cirle(Canvas canvas){
       // 实例化画笔
         paint=new Paint();
        //设置画笔颜色
        paint.setColor(Color.YELLOW);
        //设置画笔宽度
        paint.setStrokeWidth(10);
        //设置圆的类型,一个空心圆
        paint.setStyle(Paint.Style.STROKE);
        //设置抗锯齿
        paint.setAntiAlias(true);

        canvas.drawCircle(getWidth()/2,getHeight()/2,100,paint);


    }
}
