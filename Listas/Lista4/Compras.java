package Lista4;

import java.util.*;

// Programa que retorna valores de uma lista de compra

public class Compras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double produto = 0;
        double mediaSoma = 0;
        double maiorV = Double.MIN_VALUE;
        double menorV = Double.MAX_VALUE;

        
        for (int i = 1; i <= 10; i ++) {
            System.out.println("Digite o valor do produto");
            produto = sc.nextDouble();

            mediaSoma += produto;

            if (produto < menorV){
                menorV = produto;
            }

            if (produto > maiorV){
                maiorV = produto;
            }
        }

        System.out.println("\n== Resultados finais ==");
        System.out.println("A media da compra é: "+mediaSoma/10);
        System.out.println("O maior valor é: "+maiorV);
        System.out.println("O menor valor é: "+menorV);
        System.out.println("A diferença é de: "+(maiorV-menorV));

        sc.close();

    }
}
