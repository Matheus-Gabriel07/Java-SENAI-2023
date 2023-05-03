// Esse programa faz a verificação de aluno se eles estão aprovados, ou reprovados, pelo número de faltas e média

package ListadeExercicios2;

import java.util.Scanner;

public class Aprovação {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==Aprovação de ALunos==");
        System.out.println("Digite o nome do aluno");
        String nomeALuno = sc.nextLine();

        System.out.println("Digite a média do aluno");
        double media = sc.nextDouble();

        System.out.println("Digite a frequência do aluno");
        int frequencia = sc.nextInt();

        if (media>=6){
            if (frequencia>=75 && frequencia<100){
                System.out.println("O aluno "+nomeALuno+" está aprovado");
            }
            else{
                System.out.println("O aluno "+nomeALuno+" está reprovado");
            }
        }
        else if (media<6){
            System.out.println("O aluno "+nomeALuno+" está reprovado");
        }

        sc.close();
    }
}
