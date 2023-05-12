import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPessoas = 0, numPeso = 0, numIdade = 0;
        int peso, idade;
        double altura, numAltura = 0;

        int idoso = 50;
        int pesoMin = 40;
        double alturaMin = 1, alturaMax = 2;

        System.out.println("== Cadastro de pessoas ==");

        while (numPessoas != 5) {
                System.out.println("Digite um peso");
                peso = sc.nextInt();

                System.out.println("Digite uma idade");
                idade = sc.nextInt();

                System.out.println("Digite uma altura");
                altura = sc.nextDouble();

                System.out.println("============");
                numPessoas++;

                if (peso <= pesoMin) {
                    numPeso++;
                } 
                if (idade >= idoso) {
                    numIdade++;
                }
                if (altura >= alturaMin && altura <= alturaMax){
                    numAltura++;
                }
        }
        System.out.println("== Resultados finais \n");
        System.out.println("Pessoas acima de 50: "+numIdade);
        System.out.println("Pessoas abaixo de 40kg: "+numPeso);
        System.out.println("Pessoas na altura média: "+numAltura);

        sc.close();
    }
}
