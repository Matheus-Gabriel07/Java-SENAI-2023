package Aula04;

import java.util.Scanner;

import org.omg.CORBA.ARG_OUT;

public class Escola { //Esse programa cadastra alunos via scanner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada de dados
        System.out.println("==Cadastro do aluno==");
        System.out.println("Digite o nome do aluno:");
        String nomeAluno = sc.nextLine();

        System.out.println("Digite a idade do aluno:");
        int idade = sc.nextInt();

        System.out.println("Digite o telefone:");
        int tel = sc.nextInt();

        System.out.println("Digite a média do aluno:");
        double media = sc.nextDouble();

        System.out.println("Digite a quantidade de faltas:");
        int faltas = sc.nextInt();

        //Condicionais
        if (media>=5.1 && faltas<4){
            System.out.println("O alunos "+nomeAluno+" está aprovado");
        }
        if (media==5 && faltas>=5 && faltas<19){
            System.out.println("O alunos "+nomeAluno+" está de recuperação, entre em contato "+tel);
        }
        if (media<5 && faltas>=20){
            System.out.println("O alunos "+nomeAluno+" está de reprovado, entre em contato "+tel);
        }
        sc.close();
    }
}
