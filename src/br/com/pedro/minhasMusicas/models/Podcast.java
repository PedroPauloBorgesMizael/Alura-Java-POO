package br.com.pedro.minhasMusicas.models;

public class Podcast extends Audio{
  private String apresentador;
  private String descriacao;

  public String getApresentador() {
    return apresentador;
  }

  public void setApresentador(String apresentador) {
    this.apresentador = apresentador;
  }

  public String getDescriacao() {
    return descriacao;
  }

  public void setDescriacao(String descriacao) {
    this.descriacao = descriacao;
  }
}
