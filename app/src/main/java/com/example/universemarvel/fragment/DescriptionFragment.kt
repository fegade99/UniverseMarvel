package com.example.universemarvel.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.universemarvel.databinding.FragmentDescriptionBinding


class DescriptionFragment : Fragment() {

    private var binding: FragmentDescriptionBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDescriptionBinding.inflate(inflater)
        return binding?.root
    }
}