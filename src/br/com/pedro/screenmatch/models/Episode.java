package br.com.pedro.screenmatch.models;

import br.com.pedro.screenmatch.calculations.Classifiable;

public class Episode implements Classifiable {
    private int number;
    private String name;
    private Serie serie;
    private int fullViews;

    public int getNumber() {
        return number;
    }

    public int getFullViews() {
        return fullViews;
    }

    public void setFullViews(int fullViews) {
        this.fullViews = fullViews;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
        if (fullViews > 100) {
            return 4;
        } else {
        return 2;
        }
    }
}
