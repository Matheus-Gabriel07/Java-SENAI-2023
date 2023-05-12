import java.util.*;

public class Compras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double produto = 0;
        double mediaSoma = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;

        
        for (int i = 1; i <= 10; i ++) {
            System.out.println("Digite o valor do produto");
            produto = sc.nextDouble();

            mediaSoma += produto;

            if (produto < menor){
                menor = produto;
            }

            if (produto > maior){
                maior = produto;
            }
        }

        System.out.println("\n== Resultados finais ==");
        System.out.println("A media da compra é: "+mediaSoma/10);
        System.out.println("O maior valor é: "+maior);
        System.out.println("O menor valor é: "+menor);
        System.out.println("A diferença é de: "+(maior-menor));

        sc.close();

    }
}
