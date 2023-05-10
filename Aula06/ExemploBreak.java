package Aula06;

/* Break -> Parar o laço de repetição
 * Continue -> Continuar depois de determinado trecho
*/

public class ExemploBreak {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println("O valor de i é: "+i);

            if (i == 3) {
                System.out.println(i);
                continue;
            }

            if (i == 8) {
                System.out.println("Parando a execução do programa");
                break;
            }
        }
    }
}
