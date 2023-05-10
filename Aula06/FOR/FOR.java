package Aula06.FOR;

public class FOR {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            if (i%2==0 && i%3==0){
                System.out.println(i+" esse número é par e multiplo de 3");
            }else if (i%2!=0 && i%3==0) {
                System.out.println(i+" esse número é impar e multiplo de 3");
            }

            if (i%2==0 && i%4==0){
                System.out.println(i+" esse número é par e multiplo de 4");
            }else if (i%2!=0 && i%4==0) {
                System.out.println(i+" esse número é impar e multiplo de 4");
            }

            if (i%2==0 && i%5==0){
                System.out.println(i+" esse número é par e multiplo de 5");
            }else if (i%2!=0 && i%5==0) {
                System.out.println(i+" esse número é impar e multiplo de 5");
            }
        }
    }
}
