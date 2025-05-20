package br.com.pedro.banco.models;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar (double valor) {
        if(saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
            return;
        }
    }

    public String consultarSaldo() {
        return "Saldo disponível na conta: " + saldo;
    }
}
