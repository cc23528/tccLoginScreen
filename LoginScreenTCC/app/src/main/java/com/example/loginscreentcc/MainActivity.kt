package com.example.loginscreentcc

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction
import com.example.loginscreentcc.ui.LoginFragment

class MainActivity : AppCompatActivity(), NavegationHost {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            if (savedInstanceState == null){
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container, LoginFragment())
                    .commit()
            }

            insets


        }
    }

    override fun navigateTo(fragment: Fragment, addToBackstack: Boolean) {
        val transaction : FragmentTransaction = supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)

        if(addToBackstack){
            transaction.addToBackStack(null)
        }
        transaction.commit()
    }
}

