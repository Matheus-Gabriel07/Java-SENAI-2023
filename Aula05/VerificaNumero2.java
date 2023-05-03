package Aula05;

import java.util.Scanner;

public class VerificaNumero2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = sc.nextInt();

        if (num>0){
            System.out.println("Este número é positivo");
        }
        else if (num<0) {
            System.out.println("Este número é negativo");
        }
        else {
            System.out.println("Este número é igual a 0");
        }
        sc.close();
    }
}
