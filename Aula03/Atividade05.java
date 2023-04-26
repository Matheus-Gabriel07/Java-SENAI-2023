package Aula03;

import java.util.Scanner;

public class Atividade05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeDeMaior = 18;
        int salarioMini = 1311;
        double alturaMaior = (int) 1.8;
        int pesoMenor = 60;
        String nomeMeu = "Matheus Gabriel Santos Silva";
        String generoMeu = "m";

        //Váriais de scanner
        int idade, salario, peso;
        double altura;
        String nome, genero;

        //Pedindo as informações
        System.out.println("Qual o seu nome");
        nome = sc.nextLine();
        System.out.println("Qual a sua idade: ");
        idade = sc.nextInt();
        System.out.println("Qual o seu salário: ");
        salario = sc.nextInt();
        System.out.println("Qual a sua altura: ");
        altura = sc.nextDouble();
        System.out.println("Qual o seu peso: ");
        peso = sc.nextInt();
        System.out.println("Qual o seu genero: ");
        genero = sc.next();

        //Informações verdadeiras
        System.out.println("========");
        System.out.println("Seu nome é igual ao meu? "+(nome==nomeMeu));
        System.out.println("Você é de maior? "+(idade>=idadeDeMaior));
        System.out.println("Você ganha mais que o salário minimo? "+(salario>=salarioMini));
        System.out.println("Você é alto? "+(altura>=alturaMaior));
        System.out.println("Você é leve "+(peso<pesoMenor));
        System.out.println("Seu gênero é m? "+(generoMeu==genero));
        sc.close();
    }
}
