package com.example.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter


// ページ数を設定
private const val NUM_PAGES = 5
class ScreenSlidePagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    // ページ数を設定
    override fun getCount(): Int = NUM_PAGES

    // 各ページの画面を設定
    override fun getItem(position: Int): Fragment {
        val fragment = ScreenSlidePageFragment()
        // ScreenSlidePageFragment画面側で使用するタイトル名を設定
        val args = Bundle()
        args.putString(Constance.PAGE_TITLE, "ページタイトル：" + (position + 1) + "ページ目")
        fragment.arguments = args
        return fragment
    }

}