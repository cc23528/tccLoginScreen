package com.example.loginscreentcc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class home : Fragment() {
    // TODO: Rename and change types of parameters




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.bottom_nav, container, false)
        val button = view.findViewById<Button>(R.id.settings)
        button.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_settings2)
        }
        return view
    }
}