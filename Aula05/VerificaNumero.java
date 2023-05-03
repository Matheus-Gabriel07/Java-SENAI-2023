package Aula05;

import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        if (num>0){
            System.out.println("Este número é positivo");
        }
        if (num<0) {
            System.out.println("Este número é negativo");
        }
        if (num == 0) {
            System.out.println("Este número é igual a 0");
        }
        sc.close();
    }
}
