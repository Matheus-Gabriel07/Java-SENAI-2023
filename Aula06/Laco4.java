package Aula06;

public class Laco4 {
    public static void main(String[] args) {
        // Controla o programa para garantir que ele seja executado 10x
        for (int i = 0; i<=10; i++) {

            //Verifica se i e j são pares (ao mesmo tempo))
            for(int j = 0; j<=10; j++){
                if (i%2==0 && j%2==0){
                    System.out.println("I vale: "+i+" J vale: "+j);
                }
            }
        }
    }
}
