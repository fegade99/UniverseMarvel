package com.example.universemarvel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.universemarvel.adapter.MarvelCharacterAdapter
import com.example.universemarvel.databinding.ActivityMainBinding
import com.example.universemarvel.fragment.HomeFragment
import com.example.universemarvel.model.CharacterProvider

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<HomeFragment>(R.id.fragment_home_container)
        }

    }

}