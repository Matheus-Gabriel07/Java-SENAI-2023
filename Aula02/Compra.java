package Aula02;

public class Compra {
    public static void main(String[] args) {
        int valorCompra = 15;
        double compraDesconto = valorCompra*0.9; // 90/100
        double compraJuro = valorCompra*1.1;// 10% de juros

        System.out.println("Valor da Coca: "+valorCompra);
        System.out.println("Valor com 10% de desconto: "+compraDesconto);
        System.out.println("Valo com 10% de juros: "+compraJuro);
    }
}
