package com.example.universemarvel.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.universemarvel.adapter.MarvelCharacterAdapter
import com.example.universemarvel.databinding.FragmentDescriptionBinding
import com.example.universemarvel.model.CharacterProvider
import com.example.universemarvel.model.CharacterProvider.Companion.characterList


class DescriptionFragment : Fragment(){

    private var binding: FragmentDescriptionBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDescriptionBinding.inflate(inflater)
        //val adapter = MarvelCharacterAdapter(CharacterProvider.characterList)
        //binding?.?.text = adapter
        //binding?.descriptionView?.adapter = adapter
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val character = arguments?.getParcelable<MarvelCharacter>("character")
    }

}