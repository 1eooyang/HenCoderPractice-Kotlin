package com.github.sfyc23.hencoderpractice.view.canvashelp.view

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View
import com.github.sfyc23.hencoderpractice.R

import org.jetbrains.anko.sp

class Practice_1_4_06_SkewView : View {
    companion object Factory {
        val TAG = Practice_1_4_06_SkewView::class.java.simpleName
    }
    var paint = Paint(Paint.ANTI_ALIAS_FLAG)
    var bitmap: Bitmap
    var textPaint = Paint()

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    init {
        bitmap = BitmapFactory.decodeResource(resources, R.drawable.maps)

        textPaint.color = Color.RED
        textPaint.textSize = sp(16f).toFloat()
        textPaint.textAlign = Paint.Align.CENTER
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        //先移动坐标
        canvas.save()
        canvas.translate(width / 6f, height / 2f)
        canvas.drawBitmap(bitmap, -bitmap.width / 2f, -bitmap.height / 2f, paint)
        canvas.drawText("原文件", 0f, bitmap.height / 2 + 100f, textPaint)
        canvas.restore()


        canvas.save()
        canvas.translate(width * 3 / 6f, height / 2f)

        canvas.save()
        canvas.skew(0f,0.5f)
        canvas.drawBitmap(bitmap, -bitmap.width / 2f, -bitmap.height / 2f, paint)
        canvas.restore()

        canvas.drawText("(0f,0.5f)", 0f, bitmap.height / 2 + 200f, textPaint)
        canvas.restore()



        canvas.save()
        canvas.translate(width * 5 / 6f, height / 2f)
        canvas.save()
        canvas.skew(0.8f,0f)
        canvas.drawBitmap(bitmap, -bitmap.width / 2f, -bitmap.height / 2f, paint)
        canvas.restore()
        canvas.drawText("(0.8f,0f)", 0f, bitmap.height / 2 + 100f, textPaint)
        canvas.restore()
    }
}
