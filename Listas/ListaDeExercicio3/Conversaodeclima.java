// Esse programa faz conversão de medidas de temperatura

package ListaDeExercicio3;

import java.util.Scanner;

public class Conversaodeclima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kelvin;
        double fahern;

        System.out.println("==Conversão de Temperatura==");
        System.out.println("Digite uma temperatura em Celsius");
        int celsius = sc.nextInt();

        kelvin = (celsius+273);
        fahern = (celsius*1.8+32);

        System.out.println("A temperatura em Fahrenheit é de "+fahern+"ºF");
        System.out.println("A temperatura em Kelvin é de "+kelvin+"k");

        sc.close();
    }
    
}
