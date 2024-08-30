import java.util.Objects;

/**
 * Nessa classe, serão definidos os elementos, que serão inicializados em ListaLigada, e utilizados com seus métodos.
 * No momento, os elementos serão apenas em tipo String. Futuramente, criarei uma lista ligada genérica para trabalhar
 * com os outros tipos de dados.
 * **/

public class Elemento <TIPO> {

    private TIPO valor;
    private Elemento<TIPO> proximo;

    public Elemento(TIPO novoValor) {

        this.valor = novoValor;
    }

    //MÉTODOS DE INSTÂNCIA:

    public TIPO getValor() {
        return valor;
    }

    public void setValor(TIPO novoValor){

        valor = novoValor;
    }

    public Elemento<TIPO> getProximo() {

        return proximo;
    }

    public void setProximo(Elemento<TIPO> proximo) {
        this.proximo = proximo;
    }

}
