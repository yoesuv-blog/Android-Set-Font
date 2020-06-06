package com.yoesuv.setfont

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yoesuv.setfont.databinding.FragmentThreeBinding

class FragmentThree: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return FragmentThreeBinding.inflate(inflater, container, false).root
    }

}