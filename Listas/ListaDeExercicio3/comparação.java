//Esse programa compara a idade entre duas pessoas

package ListaDeExercicio3;

import java.util.Scanner;

public class comparação {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º nome");
        String nome1 = sc.nextLine();
        System.out.println("Digite sua idade");
        int idade1 = sc.nextInt();

        System.out.println("Digite o 2º nome");
        String nome2 = sc.next();
        System.out.println("Digite sua idade");
        int idade2 = sc.nextInt();

        if (idade1>idade2){
            System.out.println("O "+nome1+" é mais velho que o "+nome2);
        }
        else{
            System.out.println("O "+nome2+" é mais velho que o "+nome1);
        }
        sc.close();
    }
}
