// Tipos de variáveis em Java
/*  Variáveis
 *String -> Armazena texto
 *char -> Armazena uma única letra
 *int > Número inteiros
 *float -> Números decimais
 *double -> Números decimai. Maior precisão
*/ 

/* Regras para criar variáveis
 * Toda variável deve começar com letra minúscula;
 * Não pode haver espaço no nome da variável;
 * nomeAluno, enderecoCliente, produtoAdquirido
*/

public class Exemplo01{
    public static void main(String[] args) {
        String nome = "Matheus Gabriel";
        int idade = 15;
        boolean chuva = true; // Em variáveis booleanas, eu uso true ou false
        char letra = 'M'; // Todo char deve estar com aspas simples ''
        double salario = 5500.52;
        float altura = (float) 1.83; // Estou convertendo um double para float

        System.out.println("Meu nome é: "+nome);
        System.out.println("Minha idade é: "+idade);
        System.out.println("Está chovendo? "+chuva);
        System.out.println("A inicial do meu nome é: "+letra);
        System.out.println("O meu salário é: "+salario);
        System.out.println("Eu tenho: "+altura+" metros");
    }    
}