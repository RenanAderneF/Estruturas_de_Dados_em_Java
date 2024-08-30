public class Iterator<TIPO> {

    private Elemento<TIPO> elemento;

    Iterator(Elemento<TIPO> atual){

        this.elemento = atual;
    }

    public boolean temProximo(){

        return elemento.getProximo() != null;
    }

    public Elemento<TIPO> getProximo(){

        elemento = elemento.getProximo();
        return elemento;
    }

    public Elemento<TIPO> getAtual(){

        return elemento;
    }
}
