// Esse programa faz o cadastro e salário de funcionários

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nomeFunc, endeco;
        int tel, idade, horas;
        double salario, valorHora;

        System.out.println("Qual o nome do funcionário:");
        nomeFunc=sc.nextLine();
        System.out.println("Digite o endeço do funcionário:");
        endeco=sc.nextLine();
        System.out.println("Digite a idade do funcionário");
        idade=sc.nextInt();
        System.out.println("Digite o telefone do funcionário:");
        tel=sc.nextInt();
        System.out.println("O valor da hora é:");
        valorHora=sc.nextInt();
        System.out.println("Quantas horas ele vai trabalhar?");
        horas=sc.nextInt();
        salario=horas*valorHora;
        System.out.println("O funcionário "+nomeFunc+" vai receber um salário de "+salario+" reais");
        sc.close();
    }
}