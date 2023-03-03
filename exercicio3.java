package lista4;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int x;
        int[] m = new int[10];

        // adiciona valor ao A
        for (int i = 0; i < 10; i++) {
            System.out.println(" informe os numeros");
            vetorA[i] = input.nextInt();

        }

        //vetorA=x;



            System.out.println("informe o valor de x");
            x= input.nextInt();


            //calcula
            for (int i= 0; i < 10 ; i++) {

                m[i]= vetorA[i]* x;
                System.out.println("o valor final é:  " + m[i]);

            }






        input.close();
    }

}
