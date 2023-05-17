package Lista5;

import java.util.Scanner;

public class geometria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        int opc;
        double respostaVolume, respostaArea;

        do {
            System.out.println("***Menu de opções***\n");
            System.out.println("1 - Cubo \n");
            System.out.println("2 - Esfera \n");
            System.out.println("3 - Sair do programa\n");

            System.out.println("Digite uma opção");
            opc = sc.nextInt();

            if (opc == 1){
                System.out.println("Digite o lado do cubo");
                double resp = sc.nextDouble();

                respostaVolume = (resp*resp*resp);
                respostaArea = (resp*resp);

                System.out.println("O volume do cubo é "+respostaVolume+"\n");
                System.out.println("A área do cubo é "+respostaArea+"\n");
            }

            if (opc == 2){
                System.out.println("Digite o raio");
                double resp = sc.nextDouble();

                respostaVolume = (4/3)*3.14*(resp*resp*resp);
                respostaArea = (3.14)*(resp*resp);

                System.out.println("O volume do cubo é "+respostaVolume+"\n");
                System.out.println("A área do cubo é "+respostaArea+"\n");
            }

            if (opc == 3){
                continuar = false;
            }
        } while (continuar);
        sc.close();
    }
}
