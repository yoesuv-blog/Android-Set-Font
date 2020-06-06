package com.yoesuv.setfont

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.yoesuv.setfont.databinding.FragmentChildBinding

class FragmentChild: Fragment() {

    companion object {
        const val EXTRA_DATA = "extra_data"
        fun getInstance(text: String): Fragment {
            val bundle = Bundle()
            bundle.putString(EXTRA_DATA, text)
            val fragmentChild =  FragmentChild()
            fragmentChild.arguments = bundle
            return fragmentChild
        }
    }

    private lateinit var binding: FragmentChildBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentChildBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textViewFragmentChild.text = arguments?.getString(EXTRA_DATA)
    }

}