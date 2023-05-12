package com.example.universemarvel.fragment

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.universemarvel.adapter.MarvelCharacterAdapter
import com.example.universemarvel.databinding.FragmentHomeBinding
import com.example.universemarvel.model.CharacterProvider
import com.example.universemarvel.model.MarvelCharacter
import kotlinx.coroutines.*


class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null
    private val coroutineScope = MainScope()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        initRecyclerView()
        loadData()
        return binding?.root
    }

    private fun initRecyclerView(){
        binding?.recyclerCharacter?.layoutManager = LinearLayoutManager(this.context)
        val adapter = MarvelCharacterAdapter(
            emptyList()
        ){
            navigateTo(it)
        }
        binding?.recyclerCharacter?.adapter = adapter
    }


    private fun navigateTo(character: MarvelCharacter){

        findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToDescriptionFragment(character))
        Log.d(TAG, "onItemClick: $character")
    }

    private fun loadData() {
        coroutineScope.launch(Dispatchers.IO) {
            val characterList = CharacterProvider.characterList
            withContext(Dispatchers.Main) {
                binding?.recyclerCharacter?.adapter = MarvelCharacterAdapter(characterList){
                    navigateTo(it)
                }
            }
        }
    }
    override fun onDestroy() {
        binding = null
        coroutineScope.cancel()
        super.onDestroy()
    }
}