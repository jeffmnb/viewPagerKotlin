package com.example.viewpagekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val itemList = listOf(
            "Tela 1",
            "Tela 2",
            "Tela 3"
        )

        val viewPager2 = findViewById<ViewPager2>(R.id.viewPager2)
        viewPager2.adapter = ViewPager2Adapter(this, itemList)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        TabLayoutMediator(tabLayout, viewPager2) {_, _ ->}.attach()
    }
}