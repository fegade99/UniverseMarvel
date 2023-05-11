package com.example.universemarvel.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.universemarvel.R
import com.example.universemarvel.databinding.ItemCharacterBinding
import com.example.universemarvel.fragment.DescriptionFragment
import com.example.universemarvel.fragment.HomeFragmentDirections
import com.example.universemarvel.model.MarvelCharacter

class MarvelCharacterAdapter(private val characterList: List<MarvelCharacter>, private val itemListener : OnItemClickListener) : RecyclerView.Adapter<MarvelCharacterAdapter.MarvelCharacterViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarvelCharacterViewHolder {
        return MarvelCharacterViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_character, parent, false), itemListener)

    }

    override fun onBindViewHolder(holder: MarvelCharacterViewHolder, position: Int) {
        val item = characterList[position]
        holder.render(item)

    }

    override fun getItemCount(): Int = characterList.size

    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }

    class MarvelCharacterViewHolder(itemView: View, listener: OnItemClickListener) : RecyclerView.ViewHolder(itemView) {

        val binding = ItemCharacterBinding.bind(itemView)

        fun render(marvelCharacterModel: MarvelCharacter) {
            binding.tvCharacterName.text = marvelCharacterModel.characterName
            binding.tvShortDescription.text = marvelCharacterModel.description
        }

        init {
            itemView.setOnClickListener {
                val itemListener = listener
                listener.onItemClick(adapterPosition)
            }
        }
    }

}