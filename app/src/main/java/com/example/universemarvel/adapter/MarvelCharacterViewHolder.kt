package com.example.universemarvel.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.universemarvel.databinding.ItemCharacterBinding
import com.example.universemarvel.model.MarvelCharacter

class MarvelCharacterViewHolder(view: View):ViewHolder(view){

    val binding = ItemCharacterBinding.bind(view)

    fun render(marvelCharacterModel: MarvelCharacter){
        binding.tvCharacterName.text = marvelCharacterModel.characterName
        binding.tvShortDescription.text = marvelCharacterModel.description
    }


}