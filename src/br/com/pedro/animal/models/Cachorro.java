package br.com.pedro.animal.models;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
    public void abanorORabo() {
        System.out.println("O cachorro está abanando o rabo!");
    }
}
