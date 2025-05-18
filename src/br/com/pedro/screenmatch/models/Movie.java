package br.com.pedro.screenmatch.models;

import br.com.pedro.screenmatch.calculations.Classifiable;

public class Movie extends Title implements Classifiable {
  private String director;

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  @Override
  public int getClassification() {
    return (int) getAverageRating();
  }
}
