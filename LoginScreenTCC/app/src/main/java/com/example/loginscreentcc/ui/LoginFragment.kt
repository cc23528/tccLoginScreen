package com.aldemir.cursoandroidkotlin.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aldemir.cursoandroidkotlin.NavigationHost
import com.aldemir.cursoandroidkotlin.R
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //era pro login_button.setOnClickListener pegar do fragment_login.xml mas nao to conseguindo importar
        //tem q implementar o navigationHost tbm
        login_button.setOnClickListener {
            (activity as NavigationHost).navigateTo(HomeFragment(), false)
        }
    }

    companion object {

    }
}