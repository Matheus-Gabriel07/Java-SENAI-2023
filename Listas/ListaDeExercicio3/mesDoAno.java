//Esse programa mostra a quantidade de dias de qualquer mês

package ListaDeExercicio3;

import java.util.Scanner;

public class mesDoAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Váriaiveis
        int jan = 31, mar = 31, maio = 31, jul = 31,  ago = 31,  out = 31,  dez = 31;
        int fev = 28;
        int abr = 30, jun = 30, set = 30, nov = 30;
        
        System.out.println("Digite um número entre 1-12");
        int mes = sc.nextInt();

        if (mes>=1 && mes<=12){
            if (mes==1){
                System.out.println("Tem "+jan+" dias");
            }
            if (mes==2){
                System.out.println("Tem "+fev+" dias");
            }
            if (mes==3){
                System.out.println("Tem "+mar+" dias");
            }
            if (mes==4){
                System.out.println("Tem "+abr+" dias");
            }
            if (mes==5){
                System.out.println("Tem "+maio+" dias");
            }
            if (mes==6){
                System.out.println("Tem "+jun+" dias");
            }
            if (mes==7){
                System.out.println("Tem "+jul+" dias");
            }
            if (mes==8){
                System.out.println("Tem "+ago+" dias");
            }
            if (mes==9){
                System.out.println("Tem "+set+" dias");
            }
            if (mes==10){
                System.out.println("Tem "+out+" dias");
            }
            if (mes==11){
                System.out.println("Tem "+nov+" dias");
            }
            if (mes==12){
                System.out.println("Tem "+dez+" dias");
            }
        }
        if (mes>=12){
            System.out.println("Não existe esse mes =)");
        }
        sc.close();
    }
    
}
