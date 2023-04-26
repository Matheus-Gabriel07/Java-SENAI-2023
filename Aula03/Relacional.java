/* Operadores Relacionais: >, =>, <, <= 
 *  Operadores Lógico:
 *      E -> && (retorna verdadeiro se os os dois lados forem verdadeiros)
 *      OU -> || (retorna verdadeiro se pelo menos um dos lados for verdadeiros)
 *      == -> Verfica se o número da esquerda é igual ao da direita
 *      != -> Verifica se os números são diferentes
 * 
 * IMPORTANTE - Para comparar strings usamos o metodo "EQUALS"
 */

package Aula03;

public class Relacional {
    public static void main(String[] args) {
        int idadeDeMaior = 18;
        int idadeProfessor = 31;
        int idadeAluno = 16;

        System.out.println("Professor é mainor de idade? "+(idadeProfessor>idadeDeMaior));
        System.out.println("Profe16ssor é menor de idade? "+(idadeAluno<idadeDeMaior));
        System.out.println(idadeDeMaior==18 && idadeAluno!=16);
        System.out.println(idadeDeMaior==18 || idadeAluno!=16);
        System.out.println(idadeDeMaior==18 && idadeAluno==16); 
    }    
}