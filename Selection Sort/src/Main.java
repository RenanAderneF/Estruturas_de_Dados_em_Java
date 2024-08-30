import java.util.Arrays;

 /** O Selection Sort é um algoritmo de ordenação em que se busca o menor elemento do vetor, e o substitui com o elemento
 * atual na estrutura de repetição. O número do ponteiro comparativo é comparado constantemente com o número que se diz o
 * menor. Caso o comparativo seja menor, o ponteiro do número menor passa a referenciar a posição do comparativo, de
 * forma que seu número seja o novo menor. Caso não seja encontrado mais nenhum número menor que o já estabelecido, o
* número do ponteiro "atual" é trocado com o ponteiro de "pos_menor". A complexidade desse algoritmo é de O(n²).
 *
 */

public class Main {

    public static void main(String[] args) {

        int[] vetor = new int[10];

        for(int i= 0; i < vetor.length; i++){

            vetor[i] = (int) (Math.random() * 50);
        }

        System.out.println(STR."Vetor original: \{Arrays.toString(vetor)}");


        for(int atual = 0; atual < vetor.length; atual++){

            int pos_menor = atual;

            for(int comparativo = atual + 1; comparativo < vetor.length; comparativo++){

                if(vetor[comparativo] < vetor[pos_menor]){
                    pos_menor = comparativo;
                }
            }

            int aux = vetor[atual];
            vetor[atual] = vetor[pos_menor];
            vetor[pos_menor] = aux;

        }

        System.out.println(STR."Vetor organizado: \{Arrays.toString(vetor)}");
    }
}
