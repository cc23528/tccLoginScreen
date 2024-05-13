package com.example.loginscreentcc

import androidx.fragment.app.Fragment


interface NavegationHost {
    fun navigateTo(fragment: Fragment,addToBackstack: Boolean)
}