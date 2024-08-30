import java.util.Arrays;

public class Main {

    /**
     * <p>O Bubble Sort é um algoritmo de ordenação que compara um par de posições sequenciais por iteração, trocando
     * suas posições, seguindo o critério de organização definido.</p>
     * <p>Em um exemplo que deseje-se organizar números de forma crescente, é analisado se o valor de uma posição (i) é
     * maior ou menor que a outra (j). Caso o j não seja menor que i, i permanece em sua posição, pois já se
     * encontra organizado. Após essa iteração, i torna-se o novo j, sendo que j torna-se a posição que o sucedia.
     * Em resumo, tanto i quanto j dão um "passo" a frente na lista. </p>
     * <p> Porém, se j for menor que i, o valor da posição i torna-se o valor da posição j, e vice e versa,
     * essencialmente trocando os elementos da coleção de lugar.
     * <br> A complexidade do bubble sort é quadrática, ou O(n²).
     */

    public static void main(String[] args) {

       int[] vetor = new int[20];

        for(int i = 0; i < vetor.length; i++) {

           vetor[i] = (int) (Math.random() * 100);
        }

        System.out.println(STR."Array padrão: \{Arrays.toString(vetor)}");

       //Aplicando a lógica do bubble sort (e usando temporizador):

        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;

        for(int atual = 0; atual < vetor.length; atual++) { // O(n)

            for(int comparativo = atual + 1; comparativo < vetor.length; comparativo++){ // O (n-1)

                int aux = vetor[atual];

                if (vetor[comparativo] < aux) {

                    vetor[atual] = vetor[comparativo];
                    vetor[comparativo] = aux;
                }
            }
        }

        tempoFinal = System.currentTimeMillis();

        System.out.println(STR."Array organizado: \{Arrays.toString(vetor)}");
        System.out.println(STR."Tempo de execução: \{tempoFinal - tempoInicial} ms");

    }
}
