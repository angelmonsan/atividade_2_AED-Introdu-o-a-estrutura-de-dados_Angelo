package Trabalho_02;

public class PilhaDinamica {

    private No topo;
    private int tamanho;

    public PilhaDinamica() {
        this.topo = null;
        this.tamanho = 0;
    }

    // Verifica se está vazia
    public boolean estaVazia() {
        return topo == null;
    }

    // Empilhar
    public void empilhar(int valor) {
        No novo = new No(valor);

        // Novo nó aponta para o topo atual
        novo.proximo = topo;

        // Atualiza topo
        topo = novo;

        tamanho++;
    }

    // Desempilhar
    public int desempilhar() {
        ValidadorPilha.validarUnderflow(estaVazia());

        int valorRemovido = topo.valor;

        // Move o topo para o próximo nó
        topo = topo.proximo;

        tamanho--;
        return valorRemovido;
    }

    // Ver topo
    public int topo() {
        ValidadorPilha.validarUnderflow(estaVazia());
        return topo.valor;
    }

    // Tamanho atual
    public int tamanho() {
        return tamanho;
    }

    // Limpar pilha
    public void limpar() {
        topo = null;
        tamanho = 0;
    }

    // Exibir pilha
    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia");
            return;
        }

        System.out.println("Topo");

        No atual = topo;

        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }
}