package com.example.loginscreentcc;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.loginscreentcc.R
import com.example.loginscreentcc.databinding.ActivityMainBinding
import androidx.navigation.ui.NavigationUI
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurando o NavController
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        // Vinculando o NavController ao BottomNavigationView
        binding.bottomNavigationView.setupWithNavController(navController)

        // Alternativamente, você também pode usar NavigationUI para configurar
        // a navegação entre o NavController e o BottomNavigationView
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navController)
    }
}
