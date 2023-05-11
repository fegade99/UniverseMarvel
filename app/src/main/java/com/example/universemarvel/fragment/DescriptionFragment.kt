package com.example.universemarvel.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.universemarvel.adapter.MarvelCharacterAdapter
import com.example.universemarvel.databinding.FragmentDescriptionBinding
import com.example.universemarvel.model.CharacterProvider.Companion.characterList
import com.example.universemarvel.model.MarvelCharacter


class DescriptionFragment : Fragment() {

    private var binding: FragmentDescriptionBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDescriptionBinding.inflate(inflater)
        //val adapter = MarvelCharacterAdapter(characterList, findNavController())
        //binding?.fragmentForDescription?.text = adapter
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val character = arguments?.getParcelable<MarvelCharacter>("character")
    }
}