package com.e.rabela.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.e.rabela.R
import com.e.rabela.adapter.AdapterProduk
import com.e.rabela.adapter.AdapterSlider
import com.e.rabela.model.Produk

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    lateinit var slider: ViewPager
    lateinit var rvproduk: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View=inflater.inflate(R.layout.fragment_home, container, false)

        slider = view.findViewById(R.id.slider)
        rvproduk = view.findViewById(R.id.rv_produk)

        val array = ArrayList<Int>()
        array.add(R.drawable.slider1)
        array.add(R.drawable.slider2)
        array.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(array, activity)
        slider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        rvproduk.adapter = AdapterProduk(arrProduk)
        rvproduk.layoutManager =layoutManager

        return view
    }

    val arrProduk: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p1 = Produk()
        p1.nama = "Parfum aroma Melati"
        p1.harga = "Rp.15.000"
        p1.gambar = R.drawable.p1

        val p2 = Produk()
        p2.nama = "Parfum aroma Mawar"
        p2.harga = "Rp.15.000"
        p2.gambar = R.drawable.p2

        val p3 = Produk()
        p3.nama = "Parfum aroma Kopi"
        p3.harga = "Rp.15.000"
        p3.gambar = R.drawable.p3

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)

        return arr
    }

}
