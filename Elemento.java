import java.util.Objects;

/**
 * Nessa classe, serão definidos os elementos, que serão inicializados em ListaLigada, e utilizados com seus métodos.
 * No momento, os elementos serão apenas em tipo String. Futuramente, criarei uma lista ligada genérica para trabalhar
 * com os outros tipos de dados.
 * **/

public class Elemento {

    private final String valor;
    private Elemento proximo;

    public Elemento(String novoValor) {

        this.valor = novoValor;
    }

    //MÉTODOS DE INSTÂNCIA:

    public String getValor() {
        return valor;
    }

    public Elemento getProximo() {

        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

}
