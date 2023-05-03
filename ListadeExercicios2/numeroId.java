package ListadeExercicios2;

import java.util.Scanner;

public class numeroId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = sc.nextInt();

        if (num>0){
            System.out.println("Esse número é positivo");
        }
        else if (num<0){
            System.out.println("Esse número é negativo");
        }
        sc.close();
    }
}
