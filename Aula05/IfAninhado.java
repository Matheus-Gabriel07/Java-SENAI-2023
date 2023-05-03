package Aula05;

import java.util.Scanner;

public class IfAninhado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = sc.nextInt();

        if(num>0){
            if (num%2 == 0){
                System.out.println("O número é par e positivo");
            } else{
                System.out.println("O número é impar e positivo");
            }
        }

        else if (num<0){
            if (num%2 == 0){
                System.out.println("O número é par e negativo");
            } else{
                System.out.println("O número é impar e negativo");
            } 
        }   else{
            System.out.println("O número é zero");
        }
        sc.close();
    }
    
}
