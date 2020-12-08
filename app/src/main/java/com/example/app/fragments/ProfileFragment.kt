package com.example.app.fragments

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.app.R

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView3)

        textView.text = ProfileFragmentArgs.fromBundle(requireArguments()).name
    }

}
