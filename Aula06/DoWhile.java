package Aula06;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        boolean continuar = true;
        int opc;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=== Menu de opções do SENAI ===\n");
            System.out.println("1) Prestar atenção na aula\n");
            System.out.println("2) Fazer todos os exercícios\n");
            System.out.println("3) Não falar palavrão\n");
            System.out.println("4) Não dormir na aula\n");
            System.out.println("0 - Sair do menu\n");

            System.out.println("Digite uma opção");
            opc = sc.nextInt();

            if (opc == 0) {
                continuar=false;
                System.out.println("Programa encerrado");
            }

        } while (continuar); {
        }

        sc.close();
    }
}