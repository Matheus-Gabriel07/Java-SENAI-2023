package Aula06.WHILE;

import java.util.Scanner; 

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAluno = 0;
        double mediaAluno = 0;
        double mediaTurma = 0;
        
        System.out.println("=== INSTRUÇÕES ==");
        System.out.println("Não digite notas negativas");
        System.out.println("Para encerrar o programa digite [-1]\n");

        while(mediaAluno != -1){

            System.out.println("Digite a média do aluno");
            mediaAluno = sc.nextDouble();

            if (mediaAluno != -1){
                mediaTurma +=mediaAluno;
                numAluno++;
            }
        }

        mediaTurma = mediaTurma/numAluno;

        System.out.println("=== Resultados finais ===");
        System.out.println("A quantidade de alunos é: "+numAluno);
        System.out.println("A média da turma é: "+mediaTurma);
        sc.close();
    }
}