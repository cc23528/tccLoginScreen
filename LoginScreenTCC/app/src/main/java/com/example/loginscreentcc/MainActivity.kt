package com.example.loginscreentcc

import android.os.Bundle
import android.provider.Settings
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.loginscreentcc.databinding.ActivityMainBinding
import com.example.loginscreentcc.ui.LoginFragment

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.frame_layout) as  NavHostFragment
        navController = navHostFragment.navController
    }
}

        /*
               replaceFragment(home())
               enableEdgeToEdge()
               binding = ActivityMainBinding.inflate(layoutInflater)


               binding.bottomNavigationView.setOnItemSelectedListener{

                   when(it.itemId){
                       R.id.home -> replaceFragment(home())
                       R.id.profile -> replaceFragment(profile())
                       R.id.settings -> replaceFragment(settings())

                       else ->{


                       }


                   }
                   true
               }
       */


    /*private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }

    override fun navigateTo(fragment: Fragment, addToBackstack: Boolean) {
        TODO("Not yet implemented")
    }*/



