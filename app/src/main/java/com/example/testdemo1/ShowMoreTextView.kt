package com.example.testdemo1

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout

/**
 * 作者：wanyu.wang
 * 时间：2020/4/28:8:13 PM
 * 邮箱：wanyu.wang@midea.com
 * 说明：
 */
class ShowMoreTextView: RelativeLayout {

    companion object {
        const val MARK = "……"
        const val SHOWNUM = 2
        const val SPECEWIDTH = 110
    }

    private var showMoreLL: LinearLayout

    private var contentTextView: CustomJustifyTextView

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        View.inflate(context, R.layout.view_justify_see_more, this)

        showMoreLL = findViewById(R.id.showMoreLL)
        contentTextView = findViewById(R.id.contentTextView)

        showMoreLL.setOnClickListener{
            showMoreLL.visibility = View.GONE
            contentTextView.showMore = true
            contentTextView.requestLayout()
        }

    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        super.onLayout(changed, l, t, r, b)

        if (contentTextView.getmLineCount() <= SHOWNUM){
            showMoreLL.visibility = View.GONE
        }

    }


    fun setContentText(text: String){
        contentTextView.text = text
    }



}