package com.example.universemarvel.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.universemarvel.R
import com.example.universemarvel.databinding.FragmentDescriptionBinding
import com.example.universemarvel.databinding.ItemCharacterBinding
import com.example.universemarvel.fragment.DescriptionFragment
import com.example.universemarvel.fragment.HomeFragmentDirections
import com.example.universemarvel.model.MarvelCharacter

class MarvelCharacterAdapter(private val characterList: List<MarvelCharacter>, private val itemClickListener: (MarvelCharacter) -> Unit) : RecyclerView.Adapter<MarvelCharacterAdapter.MarvelCharacterViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarvelCharacterViewHolder {
        val binding = ItemCharacterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MarvelCharacterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MarvelCharacterViewHolder, position: Int) {
        val marvelCharacterModel = characterList[position]
        holder.render(marvelCharacterModel)
        holder.itemView.setOnClickListener{ itemClickListener(marvelCharacterModel) }
    }

    override fun getItemCount(): Int = characterList.size

    /*interface OnItemClickListener{
        fun onItemClick(name: MarvelCharacter)
    }*/

    class MarvelCharacterViewHolder(private val binding: ItemCharacterBinding) : RecyclerView.ViewHolder(binding.root) {

        fun render(marvelCharacterModel: MarvelCharacter) {
            binding.tvCharacterName.text = marvelCharacterModel.characterName
            binding.tvShortDescription.text = marvelCharacterModel.description

        }

        /*init {
            itemView.setOnClickListener {
                val itemListener = listener
                listener.onItemClick(adapterPosition)
            }
        }*/
    }

}