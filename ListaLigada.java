/** A classe de lista ligada será criada tendo em mente os seguintes requisitos:

- Reconhecer seu último e primeiro elemento.
- Possuir valores com um tipo de dado pré-determinado.
- Possuir elementos que reconhecem seu próximo.

*/
public class ListaLigada {

    private Elemento primeiro, ultimo;
    private int tamanho;

    ListaLigada(){

        this.tamanho = 0;
    }

    //MÉTODOS DE INSTÂNCIA:

    public void addElemento(String novoValor){

        //Inicializa novo elemento:

        Elemento novoElemento = new Elemento(novoValor);

        //Se lista vazia, faça:

        if (primeiro == null && ultimo == null) {

            primeiro = novoElemento;
            ultimo = novoElemento;
        }

        //Adiciona elemento após o último elemento:

        else {

            ultimo.setProximo(novoElemento);
            ultimo = novoElemento;
        }

        tamanho++;
    }

    public Elemento getElemento(int posicao){

        Elemento elementoAtual = primeiro;

        for(int i = 1; i < posicao; i++){

            //Se próximo elemento existe e não tem conteúdo nulo, faça:

            if (elementoAtual.getProximo() != null) {

                elementoAtual = elementoAtual.getProximo();

            }

        }

        return elementoAtual;

    }

    /** O método "removeElemento" funciona da seguinte maneira: quando se é desejado remover um elemento na lista ligada,
    alteramos o valor do atributo "próximo" do elemento para null. Dessa forma, ele não é referenciado de nenhuma outra
    maneira e, o que faz com que ele se torne inacessível. */

    public void removeElemento(String valorFornecido){

        Elemento anterior = null;
        Elemento atual = primeiro;

        //Se lista tiver elementos:

        if (getTamanho() != 0) {

            //Se valor atual é o valor fornecido na função:

            for (int i = 0; i <= getTamanho(); i++) {

                if(atual.getValor().equals(valorFornecido)) {

                    //Se houver apenas um elemento:

                    if (tamanho == 1){

                        primeiro = null;
                        ultimo = null;
                        System.out.println("Único elemento removido.");
                    }

                    //Se atual for o primeiro elemento:

                    else if (atual == primeiro) {

                        primeiro = atual.getProximo();
                        atual.setProximo(null);
                        System.out.println("primeiro elemento removido");
                    }

                    //Se atual for o último elemento:

                    else if (atual == ultimo) {

                        anterior.setProximo(null);
                        ultimo = anterior;
                        System.out.println("Último elemento removido.");
                    }

                    //Se o atual encontra-se no meio da lista, possuindo um anterior e próximo:

                    else {

                        anterior.setProximo(atual.getProximo());
                    }

                    tamanho--;
                    break;
                }

                anterior = atual;
                atual = atual.getProximo();
            }

        }

        else {

            System.out.println("A lista não possui elementos");
        }

    }

    public Elemento getPrimeiro(){

        return primeiro;
    }

    public Elemento getUltimo(){

        return ultimo;
    }

    public int getTamanho(){

        return tamanho;

    }

    public void listaItens(){

        Elemento atual = primeiro;

        for(int i = 1; i <= getTamanho(); i++){

            System.out.println(atual.getValor());
            atual = atual.getProximo();

        }

    }

}

