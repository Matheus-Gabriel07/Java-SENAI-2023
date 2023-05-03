package Aula05;

import java.util.Scanner;

public class ClassificacaodeNuimero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = sc.nextInt();

        if (num%2 == 0){
            if (num>0){
                System.out.println("Esse número é par e positivo");
            }
            else if (num<0){
                System.out.println("Esse número é par e negativo");
            }
        }
        
        else if (num%2 != 0){
            if (num>0){
                System.out.println("Esse número é impar e positivo");
            }
            else if (num<0){
                System.out.println("Esse número é impar e negativo");
            }
        }   else{
            System.out.println("Este númeuro é zero");
        }
        sc.close();
    }
}
