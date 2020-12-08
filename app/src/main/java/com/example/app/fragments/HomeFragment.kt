package com.example.app.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.app.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var navController : NavController
    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        editText = view.findViewById(R.id.editTextNumber)
        button = view.findViewById(R.id.button)

        button.setOnClickListener{

            val name = editText.text.toString()

            val action = HomeFragmentDirections.actionNavigationHomeToNavigationProfile(name)
            navController.navigate(action)
        }
    }


}