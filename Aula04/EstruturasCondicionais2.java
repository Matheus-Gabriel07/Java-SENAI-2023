package Aula04;

import java.util.Scanner;

public class EstruturasCondicionais2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário:");
        double salario = sc.nextDouble();

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        //Valores padrão
        int idadeDeMaior = 18;
        double salarioMinimo = 1320;

        if (salario>salarioMinimo && idade>=idadeDeMaior) {
            System.out.println("Você é maior de idade e ganha mais que o salário mínimo");
        } 
        if (salario<salarioMinimo && idade>=idadeDeMaior){
            System.out.println("Você é maior de idade e ganha menos que o salário minímo");
        }
        if (salario==salarioMinimo && idade>=idadeDeMaior){
            System.out.println("Você é maior de idade e ganha um salário minímo");
        }
        if (salario>salarioMinimo && idade<idadeDeMaior){
            System.out.println("Você é menor de idade e ganha mais que o salário minímo");
        }
        if (salario<salarioMinimo && idade<idadeDeMaior){
            System.out.println("Você é menor de idade e ganha menos que um salário minímo");
        }
        if (salario==salarioMinimo && idade<idadeDeMaior){
            System.out.println("Você é menor de idade e ganha um salário minímo");
        }
    }
}