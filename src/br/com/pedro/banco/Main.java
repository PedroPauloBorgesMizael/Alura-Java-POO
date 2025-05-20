package br.com.pedro.banco;

import br.com.pedro.banco.models.ContaBancaria;
import br.com.pedro.banco.models.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaBancaria b1 = new ContaBancaria();
        b1.depositar(200);
        System.out.println(b1.consultarSaldo());
        b1.sacar(50);
        System.out.println(b1.consultarSaldo());

        System.out.println();

        ContaCorrente b2 = new ContaCorrente();
        b2.depositar(2000);
        System.out.println(b2.consultarSaldo());
        b2.cobrarTarifaMensal(30);
        System.out.println(b2.consultarSaldo());
    }
}
