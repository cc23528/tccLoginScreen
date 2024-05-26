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
import com.example.loginscreentcc.databinding.ActivityMainBinding
import com.example.loginscreentcc.ui.LoginFragment

class MainActivity : AppCompatActivity(), NavegationHost {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        replaceFragment(home())

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

    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }

    override fun navigateTo(fragment: Fragment, addToBackstack: Boolean) {
        TODO("Not yet implemented")
    }

}

