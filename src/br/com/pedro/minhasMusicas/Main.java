package br.com.pedro.minhasMusicas;

import br.com.pedro.minhasMusicas.models.Musica;
import br.com.pedro.minhasMusicas.models.Podcast;

public class Main {
  public static void main(String[] args) {
    Musica dizAVerdade = new Musica();
    dizAVerdade.setTitulo("Diz a verdade");
    dizAVerdade.setCantor("Manin Vaqueiro");

    dizAVerdade.curtir();
    dizAVerdade.curtir();
    dizAVerdade.curtir();
    dizAVerdade.reproduzir();
    dizAVerdade.reproduzir();
    dizAVerdade.reproduzir();

    System.out.println(dizAVerdade.getTotalCurtidas());
    System.out.println(dizAVerdade.getTotalReproducoes());

    Podcast pod = new Podcast();
    pod.setTitulo("PodPa");
    pod.setApresentador("Mítico");

    for (int i = 0; i < 40; i++) {
      pod.curtir();
    }
    for (int i = 0; i < 60; i++) {
      pod.reproduzir();
    }

    System.out.println(pod.getTotalCurtidas());
    System.out.println(pod.getTotalReproducoes());
  }
}
