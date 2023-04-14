// Programa para cálclar média de alunos

// Importação nexessária para utilizar o scanner;

// SEMPRE PRECISO COLOCAR ESSA LINHA;

import java.util.Scanner; //Para que eu possa trabalhar com entrada de dados via teclado

public class Media{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); //Sempre escrever esta linha
        double nota1, nota2, nota3, media; //Declaração das váriaveis
        String nome;
        int rm;
        
        System.out.println("Digite o nome do aluno: ");
        nome=sc.nextLine();
        System.out.println("Digite o RM do aluno: ");
        rm=sc.nextInt();
        System.out.println("Digite a 1ª nota: ");
        nota1=sc.nextDouble();
        System.out.println("Digite a 2ª nota: ");
        nota2=sc.nextDouble();
        System.out.println("Digite a 3ª nota: ");
        nota3=sc.nextDouble();
        media = (nota1+nota2+nota3)/3;
        System.out.println("O aluno "+nome+"do RM: "+rm+" que sua média final no SENAI é: "+media);
        sc.close();
    }
}