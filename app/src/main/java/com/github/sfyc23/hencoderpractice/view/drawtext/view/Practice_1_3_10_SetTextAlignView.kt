package com.github.sfyc23.hencoderpractice.view.drawtext.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import org.jetbrains.anko.sp

class Practice_1_3_10_SetTextAlignView : View {
    companion object Factory {
        val TAG = Practice_1_3_10_SetTextAlignView::class.java.simpleName
    }
    var paint = Paint(Paint.ANTI_ALIAS_FLAG)

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        paint.textSize = sp(16).toFloat()

        // 使用 Paint.setTextAlign() 来调整文字对齐方式
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // 使用 Paint.setTextAlign() 来调整文字对齐方式

        // 第一处：使用 Paint.Align.LEFT

        canvas.drawText("Hello HenCoder(Nothing)", width / 2f, 100f, paint)

        paint.textAlign = Paint.Align.LEFT
        canvas.drawText("Hello HenCoder(LEFT)", width / 2f, 240f, paint)

        // 第二处：使用 Paint.Align.CENTER
        paint.textAlign = Paint.Align.CENTER
        canvas.drawText("Hello HenCoder(CENTER)", width / 2f, 360f, paint)

        // 第三处：使用 Paint.Align.RIGHT
        paint.textAlign = Paint.Align.RIGHT
        canvas.drawText("Hello HenCoder(RIGHT)", width / 2f, 500f, paint)




        canvas.drawLine(width / 2f, 0f, width / 2f, 360f, paint)
    }
}
