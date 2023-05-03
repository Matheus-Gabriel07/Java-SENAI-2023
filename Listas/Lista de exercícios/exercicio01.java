//Esse programa cálcula a área do quadrado.

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //Sempre escrever esta linha
        double valor, area;

        System.out.println("Insira o valor do lado do quadrado: ");
        valor=sc.nextDouble();
        area=(valor*valor);
        System.out.println("A área do quadrado é: "+area+"m²");
        sc.close();
    }
}
