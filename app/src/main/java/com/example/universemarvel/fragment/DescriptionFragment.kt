package com.example.universemarvel.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.universemarvel.databinding.FragmentDescriptionBinding
import com.example.universemarvel.model.MarvelCharacter


class DescriptionFragment : Fragment(){

    private var binding: FragmentDescriptionBinding? = null
    private val args: DescriptionFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDescriptionBinding.inflate(inflater)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val character = args.characterCard
        binding?.tvCharacterName?.text = character.characterName
        binding?.tvLongDescription?.text = character.longDescription
        val desc = arguments?.getParcelable<MarvelCharacter>("desc")
    }

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }
}