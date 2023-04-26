package Aula02;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int parcelas; //quantidade de parcelas
        double valorCompra, valorDesconto, valorJuros, valorVista, valorPrazo;
        
        System.out.println("== Garafas ==");
        System.out.println("Qual o valor do seu produto: ");
        valorCompra = sc.nextDouble();
        System.out.println("Qual a quantidade de parcelas: ");
        parcelas = sc.nextInt();
        System.out.println("Qual o valor do desconto: ");
        valorDesconto = sc.nextDouble();
        System.out.println("Qual o valor do juros a prazo: ");
        valorJuros = sc.nextDouble();
        
        valorVista = (valorCompra-(valorCompra*(valorDesconto/100))); //Cálculo do valor a vista com desconto
        valorPrazo = (valorCompra+(valorCompra*(valorJuros/100))); //Cálculo do valor da prestação
        
        System.out.println("=========");
        System.out.println("O valor da Garafa à vista é: R$"+valorVista);
        System.out.println("O valor total da Garafa parcelado: R$"+valorPrazo);
        System.out.println("O Valor de cada parcela é:"+(valorPrazo/parcelas));
        sc.close();
    }
}
