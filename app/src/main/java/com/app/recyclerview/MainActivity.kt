package com.app.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.recyclerview.adapter.PokemonAdapter
import com.app.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        val manager = LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this,manager.orientation)
        binding.recyclerView.layoutManager = manager
        binding.recyclerView.adapter = PokemonAdapter(PokemonProvider.pokemonList) { superhero ->
            onItemSelected(
                superhero
            )
        }
        binding.recyclerView.addItemDecoration(decoration)
    }

    fun onItemSelected(pokemon: Pokemon){
        Toast.makeText(this,pokemon.name,Toast.LENGTH_LONG).show()
    }
}