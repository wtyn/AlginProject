package com.example.testdemo1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    private val text1 = "意大abced利面条有很多的做法，其实主要是酱汁起决定性作用，和中国的打卤面差不多和中国的打卤面差不多和中国的打卤面差不多和中意大利面条有很多的做法，意大abced利面条有很多的做法，其实主要是酱汁起决定性作用，和中国的打卤面差不多和中国的打卤面差不多和中国的打卤面差不多和中意大利面条有很多的做法"

    private val text2 = "For every layout expression, there is a binding adapter that makes the framework calls required to set the corresponding properties or listeners. For example, the binding adapter can take care of calling the setText() method to set the text property or call the setOnClickListener() method to add a listener to the click event. The most common binding adapters, such as the adapters for the android:text property used in the examples in this page, are available for you to use in the android.databinding.adapters package. For a list of the common binding adapters, see adapters. You can also create custom adapters, as shown in the following example:"

    private lateinit var seeMoreView: ShowMoreTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        seeMoreView = findViewById(R.id.showMoreTV1)
        seeMoreView.setContentText(text1)

        showMoreTV2.setContentText(text2)

    }


    fun onFinishActivity(view: View){
        finish()
    }



}
