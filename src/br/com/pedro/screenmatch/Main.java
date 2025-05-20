package br.com.pedro.screenmatch;

import br.com.pedro.screenmatch.calculations.RecommendationFilter;
import br.com.pedro.screenmatch.calculations.TimeCalculator;
import br.com.pedro.screenmatch.models.Episode;
import br.com.pedro.screenmatch.models.Movie;
import br.com.pedro.screenmatch.models.Serie;

public class Main {
  public static void main(String[] args) {
    RecommendationFilter filter = new RecommendationFilter();

    Movie filme = new Movie();
    filme.setName("Projeto X");
    filme.setYearOfRelease(2006);
    filme.setDirector("Lebron James");
    filme.setTimeMovie(120);
    filme.showTechnicalData();
    filter.filter(filme);

    Serie Pokemon = new Serie();
    Pokemon.setName("Pokemon");
    Pokemon.setYearOfRelease(2000);
    Pokemon.showTechnicalData();
    Pokemon.setSeasons(5);
    Pokemon.setEpisodesPerSeason(12);
    Pokemon.setMinutesPerEpisode(30);

    Movie Tons = new Movie();
    Tons.setName("50 Tons de Cinza");
    Tons.setYearOfRelease(2010);
    Tons.setDirector("Leonardo Di Cabrio");
    Tons.setTimeMovie(80);
    Tons.showTechnicalData();

    TimeCalculator calculator = new TimeCalculator();
    calculator.includes(filme);
    calculator.includes(Tons);
    calculator.includes(Pokemon);
    System.out.println("Tempo necessáro para finalizar a lista: " + calculator.getTotalTime());

    Episode episode = new Episode();
    episode.setNumber(1);
    episode.setSerie(Pokemon);
    episode.setFullViews(300);
    filter.filter(episode);

  }
}
