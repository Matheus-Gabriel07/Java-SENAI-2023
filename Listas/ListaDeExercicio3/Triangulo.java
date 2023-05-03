package ListaDeExercicio3;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Digite um numero");
        int n1 = sc.nextInt();
        System.out.println("Digite um numero");
        int n2 = sc.nextInt();
        System.out.println("Digite um numero");
        int n3 = sc.nextInt();

        if (n1==n2 || n1==n3 || n2==n3){
            if (n1==n2 && n2==n3 && n1==n3){
                System.out.println("Você consegue fazer um triângulo equilátero");
            }
            else if (n1==n2 || n1==n3 || n2==n3){
                System.out.println("Você consegue fazer um triângulo isóceles");
            }
        }
        else if (n1!=n2 || n1!=n3 || n2!=n3){
            System.out.println("Você consegue fazer um triângulo escaleno");
        }   
        sc.close();
    }
}
