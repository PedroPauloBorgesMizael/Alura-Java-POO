package br.com.pedro.screenmatch.calculations;

import br.com.pedro.screenmatch.models.Movie;
import br.com.pedro.screenmatch.models.Serie;
import br.com.pedro.screenmatch.models.Title;

public class TimeCalculator {
  private int totalTime;

  public int getTotalTime() {
    return totalTime;
  }

//  public void includes (Movie m) {
//    totalTime += m.getTimeMovie();
//  }
//
//  public void includes (Serie s) {
//    totalTime += s.getTimeMovie();
//  }

  public void includes (Title t) {
    this.totalTime += t.getTimeMovie();
  }
}
