// Esse programa verifica se a palavra digitada é igual a palavra pré definida

package ListadeExercicios2;

import java.util.Scanner;

public class PalavraDigitada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String java = "JAVA";

        System.out.println("Digite uma palavra");
        String text = sc.nextLine();

        boolean verdade = java.equals(text);
        String mensagem = (verdade==true)?"A palavra digita é igual": "A palavra digitada é diferente";

        System.out.println(mensagem);

        sc.close();
    }
}
