package br.com.fiap.usuario;
import java.util.Scanner;

public class conta {

    private double saldo;


    public conta(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("deposito em " + valor + " realizado");


    }

    public void sacar (double saque){

        if (saque > 0 && saque <= saldo){

           saldo -= saque;
            System.out.println("seu saque foi realizado");
            System.out.println(saldo);

        }else {
            System.out.println("saque invalido");
        }



    }
    public double consulta(){
        System.out.println(saldo);
        return saldo;}

}