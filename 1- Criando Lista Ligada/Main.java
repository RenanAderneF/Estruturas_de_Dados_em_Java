public class Main {

    public static void main (String[] args) {

        //Inicializando listas ligadas:

        ListaLigada listaNomes, listaVazia;

        listaNomes = new ListaLigada();
        listaVazia = new ListaLigada();

        //Adicionando elementos:

        listaNomes.addElemento("Renan");
        listaNomes.addElemento("Braga");
        listaNomes.addElemento("Marcelo");
        listaNomes.addElemento("Julia");

        /* Exibindo lista até então: */

        listaNomes.listaItens();

        //Tentar remover elemento de lista vazia:

        listaVazia.removeElemento("Maurício");

        //Removendo o primeiro item de listaNomes:

        listaNomes.removeElemento("Renan");

        //Exibindo novo primeiro item:

        System.out.println(STR."Primeiro item: \{listaNomes.getPrimeiro().getValor()}");

        /* Listar itens de listaNomes mostrando que, quando o elemento possui valor null, sua referência na
        memória é descartada e, na prática, o objeto que o representa é ignorado ao realizar buscas lineares: */

        System.out.println("--------");
        listaNomes.listaItens();

        /* Apagando o item intermediário "Marcelo", a referência do próximo elemento de "Braga" é alterada para o elemento
        de "Julia". */

        listaNomes.removeElemento("Marcelo");
        System.out.println("--------");
        listaNomes.listaItens();

        //Apagando último item:

        listaNomes.removeElemento("Julia");
        System.out.println("--------");
        listaNomes.listaItens();

    }
}