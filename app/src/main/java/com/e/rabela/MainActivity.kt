package com.e.rabela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.e.rabela.fragment.AkunFragment
import com.e.rabela.fragment.HomeFragment
import com.e.rabela.fragment.KeranjangFragment

class MainActivity : AppCompatActivity() {

    val  fragmentHome: Fragment = HomeFragment()
    val  fragmentAkun: Fragment = AkunFragment()
    val  fragmentKerangjang: Fragment = KeranjangFragment()
    val  fm: FragmentManager = supportFragmentManager
    var  active: Fragment = fragmentHome

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fm.beginTransaction().add(R.id.nav_host_fragment, fragmentHome).show(fragmentHome).commit()
        fm.beginTransaction().add(R.id.nav_host_fragment, fragmentAkun).hide(fragmentAkun).commit()
        fm.beginTransaction().add(R.id.nav_host_fragment, fragmentKerangjang).hide(fragmentKerangjang).commit()
    }
}
