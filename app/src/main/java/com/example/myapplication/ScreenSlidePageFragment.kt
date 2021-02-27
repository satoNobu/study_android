package com.example.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class ScreenSlidePageFragment(): Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val viewLayout = inflater.inflate(R.layout.fragment_screen_slide_page, container, false)

        // タイトル名を取得して、設定する
        val textView = viewLayout.findViewById<TextView>(R.id.text)
        val value: String? = arguments?.getString(Constance.PAGE_TITLE, "")
        textView.text = if (value.isNullOrEmpty()) "No title" else value
        return viewLayout
    }
}