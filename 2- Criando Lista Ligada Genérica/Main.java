import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        ListaLigada<String> listaNomes = new ListaLigada<>();
        ListaLigada<Integer> listaIdade = new ListaLigada<>();
        ListaLigada<Float> listaAltura = new ListaLigada<>();

        listaNomes.addElemento("Renan");
        listaNomes.addElemento("Marcelo");
        listaNomes.addElemento("Diego");

        listaIdade.addElemento(21);
        listaIdade.addElemento(22);
        listaIdade.addElemento(23);

        listaAltura.addElemento(1.71F);

        System.out.println(listaNomes.getElemento(1).getValor());
        System.out.println(listaIdade.getElemento(1).getValor());
        System.out.println(listaAltura.getElemento(1).getValor());

        listaIdade.removeElemento(22);
        System.out.println(listaIdade.getElemento(1).getProximo().getValor()); //23
    }

}
