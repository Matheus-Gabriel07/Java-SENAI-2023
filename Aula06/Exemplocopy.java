package Aula06;

// Exemplo usando o equals

import java.util.Scanner;

public class Exemplocopy {

    public static void main(String[] args) {
        boolean continuar = true;
        String resp = "s";
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

            if (opc==1){
                System.out.println("==Prestar atenção na aula==");
                continuar = false;
                System.out.println("Você deseja continuar");
                String conti = sc.next();

                boolean verdade = resp.equals(conti);
                if (verdade == true) {
                    continuar = true;
                }

            }  
        }    
        while (continuar);
        sc.close();
    }
    
}