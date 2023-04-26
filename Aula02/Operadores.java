package Aula02;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, soma, subtracao, multiplicacao, divisao;
        int resto = 30;
        
        System.out.println("Resto da divisão: "+resto%4);
        System.out.println("Resto da 2º divisão: "+resto%5);
        System.out.println("Resto da 3º divisão: "+resto%9);
        System.out.println("Digite um número:");
        n1 = sc.nextDouble();
        System.out.println("Digite o 2º número:");
        n2 = sc.nextDouble();
        System.out.println("Digite o 3º número:");
        n3 = sc.nextDouble();
        System.out.println("Digite o 4º número:");
        n4 = sc.nextDouble();

        //Operadores Aritiméticos -> +, -, *, /, resto(%)
        soma = (n1+n2+n3+n4);
        subtracao = (n1-n2-n3-n4);
        multiplicacao = (n1*n2*n3*n4);
        divisao = (n1/n2/n3/n4);
        System.out.println("Soma: "+soma);
        System.out.println("Subtração"+subtracao);
        System.out.println("Multiplicação: "+multiplicacao);
        System.out.println("Divisão: "+divisao);
        sc.close();
    }
}