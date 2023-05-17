package Lista5;

import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = sc.nextInt();

        if (numero==2){
            System.out.println("Esse número é primo");
        } else {
            if (numero%2 == 0 || numero == Math.sqrt(numero)){
                System.out.println("Esse número não é primo");
            } else {
                System.out.println("Esse número é primo");
            }
        }
        sc.close();
    }    
}
