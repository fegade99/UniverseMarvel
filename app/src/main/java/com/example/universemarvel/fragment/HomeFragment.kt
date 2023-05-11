package com.example.universemarvel.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.universemarvel.MainActivity
import com.example.universemarvel.adapter.MarvelCharacterAdapter
import com.example.universemarvel.databinding.FragmentHomeBinding
import com.example.universemarvel.model.CharacterProvider


class HomeFragment : Fragment(), MarvelCharacterAdapter.OnItemClickListener {

    private var binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater)
        initRecyclerView()
        return binding?.root
    }

    private fun initRecyclerView(){
        binding?.recyclerCharacter?.layoutManager = LinearLayoutManager(this.context)
        binding?.recyclerCharacter?.adapter = MarvelCharacterAdapter(CharacterProvider.characterList, this@HomeFragment)
    }

    //override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //super.onViewCreated(view, savedInstanceState)


    //}

    override fun onDestroy() {
        binding = null
        super.onDestroy()
    }

    override fun onItemClick(position: Int) {
        Log.d("HomeFragment", "Clicked item $position")
    }
}