package lista4;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        String[] nomesDados = new String[5]; // guardar resultado
        String nomeQualquer;


        //a
        for (int i = 0; i < 5; i++) {
            System.out.println("adicione os nomes");
            nomesDados[i] = input.next();

        }

        System.out.println("nomes");
        for (int j = 0; j < 5; j++) {
            System.out.println(nomesDados[j] + " ");


        }
        //mm


        System.out.println("escreva um nome qualquer ");
        nomeQualquer = input.next();


        //??


        int j = 1;
        for (String r : nomesDados) {
            if (r.contains(nomeQualquer)) {
                System.out.println("ACHEI ");
            }
            j++;


        }


        input.close();
    }
}













