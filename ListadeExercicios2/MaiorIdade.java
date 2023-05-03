package ListadeExercicios2;

import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MaiorIdade = 18;

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        if (idade>=MaiorIdade) {
            System.out.println("Você é maior de idade");
        }
        
        else if (idade<MaiorIdade){
            System.out.println("Você ainda é leite com Pêra");
        }
        sc.close();
    }
}
