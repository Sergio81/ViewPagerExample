package com.androidbox.viewpagerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPager.adapter = ViewPagerAdapter(supportFragmentManager)

        nextButton.setOnClickListener {
            mPager.currentItem = mPager.currentItem + 1
        }
    }

    override fun onBackPressed() {
        if(mPager.currentItem == 0){
            super.onBackPressed()
        }else{
            mPager.currentItem = mPager.currentItem - 1
        }
    }
}
