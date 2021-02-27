package com.example.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.ViewPager

class ScreenSlidePagerActivity : FragmentActivity() {

    // ViwePager
    private lateinit var mPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_slide)

        // xml側で定義したViewPagerの基盤となるIDと紐付け
        mPager = findViewById(R.id.pager)

        // Adapterクラスを定義する
        val pagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager)
        // AdapterをViewPagerに接続する
        mPager.adapter = pagerAdapter
    }

    override fun onBackPressed() {
        if (mPager.currentItem == 0) {
            // 最初の画面からOSのバックボタンを押した場合、前画面に遷移させる
            super.onBackPressed()
        } else {
            // 最初の画面以外の場合は、前のページに戻す
            mPager.currentItem = mPager.currentItem - 1
        }
    }
}
    