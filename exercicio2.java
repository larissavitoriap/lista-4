package lista4;

public class exercicio2 {
    public static void main(String[] args) {
        int[] vetor= {5,1,4,2,7,8,3,6 };
        int [] vetor2= new int[8];

        //calcular que v2 é o dobro de v
        for (int i = 0; i < 8; i++) {

            vetor2[i]= vetor[i] + vetor[i];
            //vetor2[i]= vetor[i];


            System.out.println("O resultado de: "+ vetor[i] + "   é   " + vetor2[i]);

        }
    }
}
