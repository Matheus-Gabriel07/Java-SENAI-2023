package Lista5;

import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavraInvert = "";
        int tamanho;

        System.out.println("Digite uma palavra");
        String palavra = sc.nextLine();

        tamanho = palavra.length();

        for (int i = tamanho-1; i >= 0; i--) {
            palavraInvert += palavra.charAt(i);
        }

        if (palavra.equals(palavraInvert)) {
            System.out.println("Essa palavra é palindromo");
        } else {
            System.out.println("Essa palavra não é palindromo");
        }

        sc.close();
    }
}
