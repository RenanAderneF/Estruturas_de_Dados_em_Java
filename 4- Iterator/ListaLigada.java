/* Nesse programa, a lista ligada poderá ser utilizada para todo tipo de dado, não apenas String. Isso será feito
utilizando Generics, que são tipos parametrizados em Java.
*/
public class ListaLigada <TIPO> {

    private Elemento<TIPO> primeiro, ultimo;
    private int tamanho;

    ListaLigada(){

        this.tamanho = 0;
    }

    //MÉTODOS DE INSTÂNCIA:

    public void addElemento(TIPO novoValor){

        //Inicializa novo elemento:

        Elemento<TIPO> novoElemento = new Elemento<>(novoValor);

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

    public Elemento<TIPO> getElemento(int posicao){

        Elemento<TIPO> elementoAtual = primeiro;

        for(int i = 1; i < posicao; i++){

            //Se próximo elemento existe e não tem conteúdo nulo, faça:

            if (elementoAtual.getProximo() != null) {

                elementoAtual = elementoAtual.getProximo();

            }

        }

        return elementoAtual;

    }

    public void removeElemento(TIPO valorProcurado){

        Elemento<TIPO> anterior = null;
        Elemento<TIPO> atual = this.primeiro;

        //Se lista tiver elementos:

        if (getTamanho() != 0) {

            for (int i = 0; i < this.getTamanho(); i++) {

                //Se valor for encontrado:

                if (atual.getValor() == (valorProcurado)) {

                    //Se o primeiro elemento for escolhido:

                    if (atual == primeiro) {

                        primeiro = atual.getProximo();
                        atual = null;
                        break;

                    }

                    //Se o último valor for escolhido:

                    else if (atual == ultimo) {

                        ultimo = anterior;
                        atual = null;
                        break;
                    }

                    //Se houver apenas um elemento na lista:

                    else if (getTamanho() == 1) {

                        atual = null;
                        break;

                    } else if (getTamanho() == 0) {

                        System.out.println("Essa lista ligada está vazia.");
                        break;
                    }

                    //Se valor está no meio da lista:

                    else {

                        assert anterior != null;
                        anterior.setProximo(atual.getProximo());
                        atual.setValor(null);
                        break;
                    }

                }


                //Lista sendo percorrida, atualizando referências de "anterior" e "atual".

                anterior = atual;
                atual = atual.getProximo();

                System.out.println(STR."Iteração \{i} | Anterior: \{anterior.getValor()} | Atual: \{atual.getValor()}.");

            }
        }

        else {

            System.out.println("A lista não possui elementos");
        }
    }

    public Elemento<TIPO> getPrimeiro(){

        return primeiro;
    }

    public Elemento<TIPO> getUltimo(){

        return ultimo;
    }

    public int getTamanho(){

        return tamanho;

    }

    public Iterator<TIPO> getIterator(){

        return new Iterator<TIPO>(this.primeiro);

    }

}

