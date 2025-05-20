package br.com.pedro.carro;

import br.com.pedro.carro.models.ModeloCarro;

public class Main {
    public static void main(String[] args) {
        ModeloCarro carro1 = new ModeloCarro("Corolla",2015, 95000, 97000, 99000);
        carro1.showData();

        System.out.println();

        ModeloCarro carro2 = new ModeloCarro("Uno", 2000, 40000, 42000, 43500);
        carro2.showData();
    }
}
