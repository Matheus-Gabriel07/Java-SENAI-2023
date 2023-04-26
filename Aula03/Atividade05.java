package Aula03;

import java.util.Scanner;

public class Atividade05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeDeMaior = 18;
        int salarioMini = 1311;
        double alturaMaior = (int) 1.8;
        int pesoMenor = 60;
        String generoMeu = "m";

        //Váriais de scanner
        int idade, salario, peso;
        double altura;

        //Pedindo as informações

        System.out.println("Digite o nome padrão: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu nome: ");
        String meuNome = sc.nextLine();
        System.out.println("Digite seu genero: ");
        String genero = sc.nextLine();

        System.out.println("Qual a sua idade: ");
        idade = sc.nextInt();
        System.out.println("Qual o seu salário: ");
        salario = sc.nextInt();
        System.out.println("Qual a sua altura: ");
        altura = sc.nextDouble();
        System.out.println("Qual o seu peso: ");
        peso = sc.nextInt();
      
        //Aplicação da igualdade de Strings
        boolean iguais =nome.equals(meuNome);
        boolean semelhante = generoMeu.equals(genero);

        String mensagem = (iguais==true)?"True": "False";
        String mensagem2 = (semelhante==true)?"True": "False";


        //Informações verdadeiras
        System.out.println("========");//Separar
        System.out.println("Seu nome é igual ao meu? "+(mensagem));
        System.out.println("Seu gênero é m? "+(mensagem2));
        System.out.println("Você é de maior? "+(idade>=idadeDeMaior));
        System.out.println("Você ganha mais que o salário minimo? "+(salario>=salarioMini));
        System.out.println("Você é alto? "+(altura>=alturaMaior));
        System.out.println("Você é leve "+(peso<pesoMenor));
        sc.close();
    }
}
