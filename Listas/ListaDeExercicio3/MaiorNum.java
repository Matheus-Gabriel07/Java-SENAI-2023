//Esse programa exibe o maior número entre três

package ListaDeExercicio3;

import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        double n1 = sc.nextDouble();
        System.out.println("Digite um número");
        double n2 = sc.nextDouble();
        System.out.println("Digite um número");
        double n3 = sc.nextDouble();

        if (n1>n2 && n1>n3){
            System.out.println("Esse é o maior numero: " +n1);
        }
        else if (n2>n1 && n2>n3){
            System.out.println("Esse é o maior numero: " +n2);
        }
        else if (n3>n2 && n3>n1){
            System.out.println("Esse é o maior numero: " +n3);
        }

        sc.close();
    }
}
