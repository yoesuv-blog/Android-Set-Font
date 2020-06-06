package com.yoesuv.setfont

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class AppPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val data = arrayOf("Child One", "Child Two", "Child Three")

    override fun getItem(position: Int): Fragment {
        return FragmentChild.getInstance(data[position])
    }

    override fun getCount(): Int {
        return data.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return data[position]
    }
}