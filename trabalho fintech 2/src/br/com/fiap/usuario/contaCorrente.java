package br.com.fiap.usuario;

public class contaCorrente extends conta {

    public contaCorrente(double saldo) {
        super(saldo);
    }@Override
    public void sacar(double saque) {
        super.sacar(saque);
        System.out.println("Saque realizado pela conta corrente");

    }
}



