package Aula04;

import java.util.Scanner;
public class EstruturasCondicionais{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a sua idade?"); //Digitação da idade
        int idade = sc.nextInt();
        int idadeDeMaior = 18;

        if (idade>=idadeDeMaior) { //Em caso afirmativo
            System.out.println("O aluno é maior de idade");
        }
        else {
            System.out.println("O aluno é menor de idade");
        }
        sc.close();
    }
}