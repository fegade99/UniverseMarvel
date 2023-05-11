package com.example.universemarvel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.universemarvel.R
import com.example.universemarvel.model.MarvelCharacter

class MarvelCharacterAdapter(private val characterList: List<MarvelCharacter>) : RecyclerView.Adapter<MarvelCharacterViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarvelCharacterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MarvelCharacterViewHolder(layoutInflater.inflate(R.layout.item_character, parent, false))
    }

    override fun onBindViewHolder(holder: MarvelCharacterViewHolder, position: Int) {
        val item = characterList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = characterList.size
}