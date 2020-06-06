package com.yoesuv.setfont

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yoesuv.setfont.databinding.FragmentThreeBinding

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
    }

}