import java.util.Arrays;

/**
 * <p> O Insertion Sort é um algoritmo de ordenação que compara um elemento aos seus anteriores, movendo os elementos
 * anteriores de maior valor para a posição a frente, essencialmente os copiando. Caso encontrado um anterior de menor
 * valor, o elemento comparado é "encaixado" a sua frente no vetor.</p>
 * <p>É parecido com o ato de organizar uma carta em um baralho, posicionando ela na menor (ou maior posição) em relação
 * as outras.</p>
 * <p> O exemplo abaixo será de uma estrutura ordenada,onde os elementos são inteiros, e deseja-se ordená-los em
 *  * ordem crescente. </p>
 * <p> 1) Haverá um ponteiro que analisará as posições do vetor, comparando-as com seu número consecutivo. Caso o
 * número anterior seja menor, ele permanecerá na posição, enquanto a iteração prossegue para o próximo número no vetor.</p>
 * <p> 2) Caso o número anterior seja maior que seu consecutivo, o consecutivo será definido como "a sortir". Com isso,
 * o número anterior vai pra posição da frente, e o número menor é armazenado.</p>
 * <p> 3) Enquanto essa condição for verdadeira, o número "a sortir" troca de posição com seus anteriores, até que seja
 * completamente organizado em relação a eles.</p>
 * <p> 4) Após esse processo, a iteração prossegue para o próximo elemento.</p>
 */


public class Main {

    public static void main(String[] args) {

        int[] vetor = new int[30];

        for(int i = 0; i < vetor.length; i++){

            vetor[i] = (int) (Math.random() * 40);
        }

        System.out.println(STR."Vetor original: \{Arrays.toString(vetor)}");

        for(int atual = 1; atual < vetor.length; atual++){

            int aux = vetor[atual];
            int comparativo = atual - 1;

            while(comparativo >= 0 && vetor[comparativo] > aux){

                vetor[comparativo + 1] = vetor[comparativo];
                comparativo--;
            }

            vetor[comparativo + 1] = aux;
        }

        System.out.println(STR."Vetor organizado: \{Arrays.toString(vetor)}");
    }
}
