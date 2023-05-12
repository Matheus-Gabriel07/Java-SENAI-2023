package Aula06;

// Exemplo usando if para continuar com int == true

import java.util.Scanner;

public class Exemplo {

    public static void main(String[] args) {
        boolean continuar = true;
        int resp;
        int opc;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("***Menu de opções do Senai***\n");
            System.out.println("1 - Prestar atenção na aula \n");
            System.out.println("2 - Fazer todos os exercícios \n");
            System.out.println("3 - NÃO falar palavrão\n");
            System.out.println("4 - NÃO dormir na aula\n");
            System.out.println("5 - NÃO usar o Instagram\n");
            System.out.println("6 - NÃO passar o número para os outros\n");
            System.out.println("7 - Ouvir os conselhos do Profº Edgard\n");
            System.out.println("0 - Sair do Menu\n");

            System.out.println("Digite a opção desejada");
            opc = sc.nextInt();

            if(opc==0){
                continuar=false;
                System.out.println("POGRAMA ENCERRADÚ MANO!");
            }

            if(opc==1){
                System.out.println("== Prestar atenção na aula ==\n");
                continuar = false;
                System.out.println("Você deseja continuar");
                System.out.println("Digite o numero 1 para continuar, e 2 para sair");
                resp = sc.nextInt();

                if (resp == 1) {
                    continuar = true;
                }

            }  
        }    
        while (continuar);
        sc.close();
    }
    
}