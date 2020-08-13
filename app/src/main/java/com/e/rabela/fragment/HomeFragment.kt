package com.e.rabela.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager

import com.e.rabela.R
import com.e.rabela.adapter.AdapterSlider

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    lateinit var slider: ViewPager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View=inflater.inflate(R.layout.fragment_home, container, false)

        slider = view.findViewById(R.id.slider)

        val array = ArrayList<Int>()
        array.add(R.drawable.slider1)
        array.add(R.drawable.slider2)
        array.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(array, activity)
        slider.adapter = adapterSlider

        return view
    }


}
