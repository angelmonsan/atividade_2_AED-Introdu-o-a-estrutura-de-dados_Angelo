package Trabalho_02;

public class PilhaEstatica {

    private int[] dados;
    private int topo;
    private int tamanhoMax;

    public PilhaEstatica(int tamanho) {
        ValidadorPilha.validarTamanho(tamanho);

        this.tamanhoMax = tamanho;
        this.dados = new int[tamanho];
        this.topo = -1;
    }

    // Verifica se está vazia
    public boolean estaVazia() {
        return topo == -1;
    }

    // Verifica se está cheia
    public boolean estaCheia() {
        return topo == tamanhoMax - 1;
    }

    // Empilhar
    public void empilhar(int valor) {
        ValidadorPilha.validarOverflow(estaCheia());

        topo++;
        dados[topo] = valor;
    }

    // Desempilhar
    public int desempilhar() {
        ValidadorPilha.validarUnderflow(estaVazia());

        int valor = dados[topo];

        //limpa posição
        dados[topo] = 0;

        topo--;
        return valor;
    }

    // Ver topo
    public int topo() {
        ValidadorPilha.validarUnderflow(estaVazia());
        return dados[topo];
    }

    // Tamanho atual
    public int tamanho() {
        return topo + 1;
    }

    // Limpar pilha
    public void limpar() {
        topo = -1;
    }

    // Imprimir pilha
    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia");
            return;
        }

        System.out.println("Topo");

        for (int i = topo; i >= 0; i--) {
            System.out.println(dados[i]);
        }
    }
}