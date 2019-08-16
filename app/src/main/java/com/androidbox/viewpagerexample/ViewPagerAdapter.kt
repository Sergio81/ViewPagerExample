package com.androidbox.viewpagerexample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.androidbox.viewpagerexample.fragments.Example1
import com.androidbox.viewpagerexample.fragments.Example2
import com.androidbox.viewpagerexample.fragments.Example3

class ViewPagerAdapter(manager: FragmentManager): FragmentStatePagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private val fragments = arrayListOf(Example1(), Example2(), Example3())

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int = fragments.size
}