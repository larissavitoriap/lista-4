package lista4;

public class exercicio {
    public static void main(String[] args) {

        int n = 10; // tamanho do vetor
        int v[] = new int[n]; // declaração e alocação de espaço para o vetor "v"
        int i; // índice ou posição

// processando os "n" elementos do vetor "v"
        for (i=0; i<n; i++) {
            v[i] = i*i*i; // na i-ésima posição do vetor "v" armazena o valor da variável "i"
        }
        for (int j = 0; j < 10; j++) {

            System.out.println(v[j]);
        }

    }

}

