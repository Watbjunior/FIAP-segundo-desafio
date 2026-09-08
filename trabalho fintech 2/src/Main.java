import java.util.Scanner;

import br.com.fiap.usuario.contaCorrente;
import br.com.fiap.usuario.usuario;
import br.com.fiap.usuario.conta;
import br.com.fiap.usuario.menus;


public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);
    usuario perfil = new usuario();
    conta minhaConta = new contaCorrente(100);
    menus navegar = new menus(tc);
    int op;
    String entrar;
    String email;
    boolean liberacao = false;


    do {
        op = navegar.menuinicial();
        switch (op){

            case 1:{

                tc.nextLine();
                System.out.println("digite seu nome" );
                entrar = tc.nextLine();
                System.out.println("digite seu email");
                email = tc.nextLine();

                if (entrar.equals(perfil.getNome())&& email.equals(perfil.getEmail())){

                    liberacao = true;
                    System.out.println("acesso liberado");
                }else {
                    System.out.println("acesso negado");
                }


                break;
            }
            case 2:{
                tc.nextLine();

                System.out.println("digite seu nome");
                perfil.setNome(tc.nextLine());

                System.out.println("digite se email");
                perfil.setEmail(tc.nextLine());

                System.out.println("digite seu cpf");
                perfil.setCpf(tc.nextLine());

                System.out.println("cadastro realizado");
                break;


            }
            case 3:{

                System.out.println("saindo...");

            }
        }


    }while (op !=3 && !liberacao);

    int oop;
    do {
         oop = navegar.menutransacao();

        switch (oop) {
            case 1:{
                System.out.println(minhaConta.consulta());
                break;
            }
            case 2:{

                System.out.println("quantia que quer depositar");
                minhaConta.depositar(tc.nextDouble());

                break;

            }

            case 3:{
                System.out.println("quantia do saque");
                minhaConta.sacar(tc.nextDouble());

                break;
            }

            case 4:{

                System.out.println("saindo...");
                break;
            }

        }




        }while (oop != 4);}