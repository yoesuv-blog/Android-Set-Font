package com.yoesuv.setfont

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.appbar.AppBarLayout
import com.yoesuv.setfont.databinding.FragmentThreeBinding
import com.yoesuv.setfont.utils.lOrAbove

class FragmentThree: Fragment() {

    private lateinit var binding: FragmentThreeBinding
    private lateinit var myAdapter: AppPagerAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        myAdapter = AppPagerAdapter(childFragmentManager)
        binding.viewPager.adapter = myAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)

        setAppBar(0F)
    }

    override fun onDestroy() {
        super.onDestroy()
        setAppBar(8F)
    }

    private fun setAppBar(elevation: Float) {
        lOrAbove {
            activity?.findViewById<AppBarLayout>(R.id.appBar)?.elevation = elevation
        }
    }

}