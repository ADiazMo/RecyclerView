package com.app.recyclerview

class PokemonProvider {
    companion object {
        val pokemonList = listOf<Pokemon>(
            Pokemon(
                "bulbasaur",
                "overgrow",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/1.png"
            ),
            Pokemon(
                "ivysaur",
                "chlorophyll",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/2.png"
            ),
            Pokemon(
                "pidgeotto",
                "keen-eye",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/17.png"
            ),
        )
    }
}