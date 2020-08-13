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
    lateinit var rvprodukTerlaris: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View=inflater.inflate(R.layout.fragment_home, container, false)

        slider = view.findViewById(R.id.slider)
        rvproduk = view.findViewById(R.id.rv_produk)
        rvprodukTerlaris = view.findViewById(R.id.rv_produk_terlaris)

        val array = ArrayList<Int>()
        array.add(R.drawable.slider1)
        array.add(R.drawable.slider2)
        array.add(R.drawable.slider3)

        val adapterSlider = AdapterSlider(array, activity)
        slider.adapter = adapterSlider

        val layoutManager = LinearLayoutManager(activity)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL

        val layoutManager2 = LinearLayoutManager(activity)
        layoutManager2.orientation = LinearLayoutManager.HORIZONTAL

        rvproduk.adapter = AdapterProduk(arrProduk)
        rvproduk.layoutManager =layoutManager

        rvprodukTerlaris.adapter = AdapterProduk(arrProdukTerlaris)
        rvprodukTerlaris.layoutManager =layoutManager2

        return view
    }
    //Produk Terbaru
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

        val p7 = Produk()
        p7.nama = "Parfum aroma Kopi"
        p7.harga = "Rp.15.000"
        p7.gambar = R.drawable.p7

        val p8 = Produk()
        p8.nama = "Parfum aroma Kopi"
        p8.harga = "Rp.15.000"
        p8.gambar = R.drawable.p8

        arr.add(p1)
        arr.add(p2)
        arr.add(p3)
        arr.add(p7)
        arr.add(p8)

        return arr
    }

    //Produk Terlaris
    val arrProdukTerlaris: ArrayList<Produk>get(){
        val arr = ArrayList<Produk>()
        val p4 = Produk()
        p4.nama = "Parfum aroma Kambojo"
        p4.harga = "Rp.15.000"
        p4.gambar = R.drawable.p4

        val p5 = Produk()
        p5.nama = "Parfum aroma Lafender"
        p5.harga = "Rp.15.000"
        p5.gambar = R.drawable.p5

        val p6 = Produk()
        p6.nama = "Parfum aroma Pandan"
        p6.harga = "Rp.15.000"
        p6.gambar = R.drawable.p6

        arr.add(p4)
        arr.add(p5)
        arr.add(p6)

        return arr
    }

}
