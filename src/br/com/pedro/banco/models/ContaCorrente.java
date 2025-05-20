package br.com.pedro.banco.models;

public class ContaCorrente extends ContaBancaria {
    public void cobrarTarifaMensal(double tarifa) {
        double valorFinal = getSaldo() - tarifa;
        setSaldo(valorFinal);
    }
}
