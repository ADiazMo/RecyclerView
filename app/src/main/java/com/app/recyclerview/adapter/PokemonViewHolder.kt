package com.app.recyclerview.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.app.recyclerview.Pokemon
import com.app.recyclerview.databinding.ItemPokemonBinding
import com.bumptech.glide.Glide

class PokemonViewHolder(view:View): RecyclerView.ViewHolder(view) {

    val binding = ItemPokemonBinding.bind(view)

    fun render(pokemonModel: Pokemon, onClickListener:(Pokemon) -> Unit){

        binding.tvName.text = pokemonModel.name
        binding.tvAbility.text = pokemonModel.abilities
        Glide.with(binding.ivPhoto.context).load(pokemonModel.photo).into(binding.ivPhoto)

        //click in the image
        /*
        binding.ivPhoto.setOnClickListener {
            Toast.makeText(
                binding.ivPhoto.context,
                pokemonModel.name,
                Toast.LENGTH_SHORT
            ).show()
        }
        */
        //click in the cell
        /*
        itemView.setOnClickListener {
            Toast.makeText(
                binding.ivPhoto.context,
                pokemonModel.name,
                Toast.LENGTH_SHORT
            ).show()
        }
        */

        //click pass to object
        itemView.setOnClickListener { onClickListener(pokemonModel) }
    }
}