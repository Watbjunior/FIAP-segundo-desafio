package br.com.fiap.usuario;
import java.util.Scanner;

public class menus {

private Scanner tc;

    public menus(Scanner tcc) {
        this.tc = tcc;
    }

    public int menuinicial(){

        System.out.println("====MENU====\n" +
                "1:login\n" +
                "2:cadastro\n" +
                "3:sair");

        return tc.nextInt();
    }

    public int menutransacao(){

        System.out.println("selecione sua acao");
        System.out.println("1: exibir saldo");
        System.out.println("2: depositar");
        System.out.println("3: sacar");
        System.out.println("4: sair");

        return tc.nextInt();
    }

}
