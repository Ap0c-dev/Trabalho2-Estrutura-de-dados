package Exercicio4;

public class Fila<T>{


    public Object[] elementos;
    public Object[] elementosJ;
    private int tamanho;
    private No ini;
    private No fim;
    private int tam;

    String i = "";
    int j = 0;
    int contador = 0;


    public Fila() {
        this(10);
    }

    public Fila(int capacidade) {
        this.elementos = (new Object[capacidade]);
        this.elementosJ = (new Object[capacidade]);
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public void enfileirar(Object elemento) {
        this.aumentaCapacidade();
        No novoNo = new No();
        novoNo.setElemento(elemento);
        if (estaVazia()){
            ini = novoNo;
        } else{
            fim.setProximo(novoNo);
        }
        fim = novoNo;
        tam++;
    }

    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            Object[] elementosNovos = (new Object[this.elementos.length * 2]);
            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
        }
            this.elementos = elementosNovos;
    }
}

    public Object espiar() {
        if (this.estaVazia()) {
            return null;
    }
        return this.elementos[0];
    }

    public Object desenfileira() {

        final int POS = 0;
        if (this.estaVazia()) {
        return null;
    }
    Object elementoRemovido = this.elementos[POS];
    for (int i = 0; i < tamanho - 1; i++) {
        elementos[i] = elementos[i + 1];
    }
    tamanho--;
    return elementoRemovido;

}
    public void FilaEncadeada(){
        ini = null;
        fim=null;
        tam = 0;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public No noProximo(){
        return ini;
    }

    public void unir (FilaEncadeada f2){
        No aux = f2.noProximo();
        while (aux != null){
            enfileirar( aux.getElemento());
            aux = aux.getProximo();
        }
    }
}