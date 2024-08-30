import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        //Testando lista ligada genérica:

        ListaLigadaGenerica<String> listaNomes = new ListaLigadaGenerica<>();
        ListaLigadaGenerica<Integer> listaIdades = new ListaLigadaGenerica<>();
        ListaLigadaGenerica<Integer> listaInt = new ListaLigadaGenerica<>();

        listaNomes.addElemento("Renan");
        listaNomes.addElemento("Marcelo");
        listaNomes.addElemento("Alec");
        listaNomes.addElemento("Silva");
        listaNomes.listaItens();

        listaIdades.addElemento(21);
        listaIdades.addElemento(22);
        listaIdades.addElemento(22);
        listaIdades.addElemento(22);
        listaIdades.listaItens();

        /* A comparação de algoritmos é complexa é possui grande fundamentação teórica para tal. Entretanto, esse programa
         se limitará a comparar o tempo de execução dos algoritmos, sendo estes a Lista ligada genérica e o vetor, da
         classe Arraylist. */


        //Vetor:

        ArrayList<Integer> listaVetor = new ArrayList<>();

        int limite = 900000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal;

        for (int i = 0; i <= limite; i++){

            listaVetor.add(i);
        }

        tempoFinal = System.currentTimeMillis();
        System.out.println(STR."Tempo de execução para a adição de \{limite} itens no vetor: \{tempoFinal - tempoInicial}");


        tempoInicial = System.currentTimeMillis();
        listaVetor.get(limite);
        tempoFinal = System.currentTimeMillis();
        System.out.println(STR."Tempo de execução para a busca do item \{limite} do vetor: \{tempoFinal - tempoInicial}");



        //Lista ligada genérica:

        tempoInicial = System.currentTimeMillis();

        for (int i = 0; i <= limite; i++){

            listaInt.addElemento(i);
        }

        tempoFinal = System.currentTimeMillis();
        System.out.println(STR."Tempo de execução para a adição de \{limite} itens na lista ligada: \{tempoFinal - tempoInicial}");


        tempoInicial = System.currentTimeMillis();
        listaInt.getElemento(limite);
        tempoFinal = System.currentTimeMillis();
        System.out.println(STR."Tempo de execução para a busca do item \{limite} na lista ligada: \{tempoFinal - tempoInicial}");




    }
}
