package com.github.sfyc23.hencoderpractice.view.drawbasal.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class Practice_1_1_3_DrawRectView : View {

    companion object Factory {
        val TAG = Practice_1_1_3_DrawRectView::class.java.simpleName
    }

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //        练习内容：使用 canvas.drawRect() 方法画矩形
        val centerX = width / 2f
        val centerY = height / 2f

        val paint = Paint()
        paint.style = Paint.Style.FILL
        paint.color = Color.BLACK
        canvas.drawRect(centerX - 250f, centerY - 250f, centerX + 250f, centerY + 250, paint)

    }
}
