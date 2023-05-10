package Aula06.WHILE;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int controle = 2;

        while(controle != 4) {

            System.out.println("Digite uma opção (1-4)");
            int op = sc.nextInt();
            
            if (op == 1){
                System.out.println("1) Start Game");
                controle = 1;
            }
            if (op == 2){
                System.out.println("2) Load Game");
                controle = 2;
            }
            if (op == 3){
                System.out.println("3) Settings");
                controle = 3;
            }
            if (op == 4){
                System.out.println("4) Exit Game");
                controle = 4;
            }
        }
        sc.close();
    }
}
