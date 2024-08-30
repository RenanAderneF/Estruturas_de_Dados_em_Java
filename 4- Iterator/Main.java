/** Essa implementação trata-se de uma continuação do projeto "Comparando LL e Vetor". No projeto atual, será feita a compara-
 * ção entre o tempo de execução da busca de um item na lista ligada por seu método tradicional (começando pelo primeiro
 * item da lista a cada busca) para um iterator, que guarda o último elemento iterado na lista, dispensando o
 * percorrimento total da lista.
 * **/

public class Main {

    public static void main(String[] args) {

        //Inicializa instância de lista ligada:
        ListaLigada<Integer> listaInt = new ListaLigada<>();


        //Preenchendo lista:
        int limite = 100000;

        for(int i = 0; i < limite; i++){

            listaInt.addElemento(i);
        }


        //Percorrendo itens na lista pela forma tradicional:
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;
        Elemento<Integer> atual = null;

        for(int i = 1; i < limite; i++){

            atual = listaInt.getElemento(i);
        }

        tempoFinal = System.currentTimeMillis();

        System.out.println(atual.getValor());
        System.out.println(STR."\{tempoFinal - tempoInicial} ms");


        //Percorrendo itens utilizando um iterator:

        //Inicializa iterador, utilizando o método construtor em listaInt:
        Iterator<Integer> iterador = listaInt.getIterator();

        tempoInicial = System.currentTimeMillis();

        while (iterador.temProximo()){

            iterador.getProximo();
        }

        tempoFinal = System.currentTimeMillis();

        System.out.println(iterador.getAtual().getValor());

        System.out.println(STR."\{tempoFinal - tempoInicial} ms");

    }
}