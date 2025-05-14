package br.com.pedro.screenmatch.modelos;

public class Serie extends Title {
  private int seasons;
  private boolean active;
  private int episodesPerSeason;
  private int minutesPerEpisode;

  public int getSeasons() {
    return seasons;
  }

  public boolean isActive() {
    return active;
  }

  public int getEpisodesPerSeason() {
    return episodesPerSeason;
  }

  public int getMinutesPerEpisode() {
    return minutesPerEpisode;
  }

  public void setSeasons(int seasons) {
    this.seasons = seasons;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public void setEpisodesPerSeason(int episodesPerSeason) {
    this.episodesPerSeason = episodesPerSeason;
  }

  public void setMinutesPerEpisode(int minutesPerEpisode) {
    this.minutesPerEpisode = minutesPerEpisode;
  }

  public int getTimeMovie() {
    return super.getTimeMovie();
  }
}
