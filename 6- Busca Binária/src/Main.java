import java.util.Arrays;

public class Main {

    /** A busca binária trabalha com a redução do vetor útil para encontrar um elemento. A posição doelemento inicial e
     * final do vetor são marcados. Com isso, essas posições são somadas e divididas por dois, encontrando sua mediana.
     * Porém, diferente da mediana, ao encontrar dois valores possíveis de serem a mediana, utiliza-se a menor posição.
     * Se, por exemplo, o valor dessa posição for menor que o valor buscado, apenas os elementos a frente dessa posição
     * são considerados para a busca, o que faz com que o tamanho do problema seja reduzido pela metade.
     * Com isso, a busca ocorre da seguinte maneira:
     * <br> 1) Armazena-se a posição inicial e final do vetor.
     * <br> 2) Soma suas posições e as divide, arredondando o valor para baixo. O elemento com a posição correspondente a
     * esse valor é analisado.
     * <br> 3) Se o valor buscado não corresponder ao valor dessa posição, é verificado se ele é maior ou menor que o valor
     * buscado.
     * <br> 4) Depois, caso o valor buscado seja menor, o elemento analisado torna-se o elemento final. Caso o valor
     * buscado seja maior, o elemento analisado torna-se o elemento inicial. Esses processos reduzem o tamanho do
     * problema pela metade a cada iteração, porém em sentidos diferentes.
     * <br> 5) O processo de divisão se repete, encontrando uma nova posição a ser analisada.
     * Esse método possui a complexidade O(log n).
     */

    public static void main(String[] args) {

        int[] vetor = new int[10];

        // Vetor [0, 2, 4, 6, 8, 10, 12, 14...]

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = i * 2;
        }

        System.out.println(Arrays.toString(vetor));

        //Aplicando a lógica da busca binária:

        int posicaoInicial = 0;
        int posicaoFinal = vetor.length - 1;
        int valorBuscado = 10;
        boolean encontrado = false;
        int iteracoes = 1;

        while(!encontrado && posicaoInicial < posicaoFinal) {

            System.out.println(STR."Posição inicial: \{posicaoInicial}");
            System.out.println(STR."Posição final: \{posicaoFinal}");
            
            int posicaoAnalisada = (posicaoInicial + posicaoFinal)/2;
            System.out.println(STR."Posição analisada: \{posicaoAnalisada}");
            
            int valorAnalisado = vetor[posicaoAnalisada];

            if(vetor[posicaoInicial] == valorBuscado){

                encontrado = true;
                System.out.println("Valor Buscado corresponde ao primeiro item!");
            }

            else if(vetor[posicaoFinal] == valorBuscado) {

                encontrado = true;
                System.out.println("Valor Buscado corresponde ao último item!");
            }

            else if(valorAnalisado < valorBuscado) {
                
                posicaoInicial = posicaoAnalisada;
            }
            
            else if(valorAnalisado > valorBuscado) {
                
                posicaoFinal = posicaoAnalisada;
            }

            else {

                encontrado =  true;
                System.out.println(STR."Valor \{valorAnalisado} encontrado!");
                System.out.println(STR."Foram realizadas \{iteracoes} iterações.");

            }

            iteracoes++;
        }
    }
}
