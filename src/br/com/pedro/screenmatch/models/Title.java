package br.com.pedro.screenmatch.models;

public class Title {
  private String name;
  private int yearOfRelease;
  private boolean included;
  private double averageRating;
  private int totalRating;
  private int timeMovie;

  public String getName() {
    return name;
  }

  public int getYearOfRelease() {
    return yearOfRelease;
  }

  public boolean isIncluded() {
    return included;
  }

  public int getTimeMovie() {
    return timeMovie;
  }

  public int getTotalRating() {
    return totalRating;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setYearOfRelease(int yearOfRelease) {
    this.yearOfRelease = yearOfRelease;
  }

  public void setIncluded(boolean included) {
    this.included = included;
  }

  public void setTimeMovie(int timeMovie) {
    this.timeMovie = timeMovie;
  }

  public double getAverageRating() {
    return averageRating;
  }

  public void evaluate(double grade) {
    averageRating+= grade;
    totalRating++;
  }

  public double averageOfEvaluations() {
    return averageRating / totalRating;
  }

  public void showTechnicalData() {
    System.out.println("Nome do filme: " + name);
    System.out.println("Ano de lançamento: " + yearOfRelease);
  }
}
