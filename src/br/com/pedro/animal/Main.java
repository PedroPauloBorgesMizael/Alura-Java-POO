package br.com.pedro.animal;

import br.com.pedro.animal.models.Cachorro;
import br.com.pedro.animal.models.Gato;

public class Main {
    public static void main(String[] args) {
        Cachorro bilu = new Cachorro();
        bilu.emitirSom();
        bilu.abanorORabo();

        Gato mingau = new Gato();
        mingau.emitirSom();
        mingau.arranharMoveis();
    }
}
