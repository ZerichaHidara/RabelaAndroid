package com.e.rabela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.e.rabela.fragment.AkunFragment
import com.e.rabela.fragment.HomeFragment
import com.e.rabela.fragment.KeranjangFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    val  fragmentHome: Fragment = HomeFragment()
    val  fragmentAkun: Fragment = AkunFragment()
    val  fragmentKerangjang: Fragment = KeranjangFragment()
    val  fm: FragmentManager = supportFragmentManager
    var  active: Fragment = fragmentHome

    private  lateinit var menu: Menu
    private  lateinit var menuItem: MenuItem
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fm.beginTransaction().add(R.id.container, fragmentHome).show(fragmentHome).commit()
        fm.beginTransaction().add(R.id.container, fragmentAkun).hide(fragmentAkun).commit()
        fm.beginTransaction().add(R.id.container, fragmentKerangjang).hide(fragmentKerangjang).commit()

        bottomNavigationView = findViewById(R.id.nav_view)
        menu = bottomNavigationView.menu
        menuItem = menu.getItem(0)
        menuItem.isChecked = true

            bottomNavigationView.setOnNavigationItemSelectedListener { item ->
                    when (item.itemId){
                        R.id.navigation_home ->{
                            Log.d("Respon","Home")
                            menuItem = menu.getItem(0)
                            menuItem.isChecked = true
                            fm.beginTransaction().hide(active).show(fragmentHome).commit()
                            active = fragmentHome
                        }
                        R.id.navigation_keranjang ->{
                            Log.d("Respon","Keranjang")
                            menuItem = menu.getItem(1)
                            menuItem.isChecked = true
                            fm.beginTransaction().hide(active).show(fragmentKerangjang).commit()
                            active = fragmentKerangjang
                        }
                        R.id.navigation_akun ->{
                            Log.d("Respon","Akun")
                            menuItem = menu.getItem(2)
                            menuItem.isChecked = true
                            fm.beginTransaction().hide(active).show(fragmentAkun).commit()
                            active = fragmentAkun
                        }
                    }

                false  }

    }
}
