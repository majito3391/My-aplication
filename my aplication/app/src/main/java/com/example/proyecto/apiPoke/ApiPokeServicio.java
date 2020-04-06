package com.example.proyecto.apiPoke;


import com.example.proyecto.modelos.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiPokeServicio {
    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPoke();
}
