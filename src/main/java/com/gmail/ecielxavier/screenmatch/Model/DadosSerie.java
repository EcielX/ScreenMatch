package com.gmail.ecielxavier.screenmatch.Model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("imdbRating") String avaliacao,
                         @JsonAlias("totalSeasons") Integer totalTemporadas) {

    @Override
    public Integer totalTemporadas() {
        return totalTemporadas;
    }
}

