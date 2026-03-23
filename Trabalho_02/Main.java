package Trabalho_02;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== PILHA ESTÁTICA ===");

        PilhaEstatica pilhaE = new PilhaEstatica(3);

        pilhaE.empilhar(10);
        pilhaE.empilhar(20);
        pilhaE.empilhar(30);

        pilhaE.imprimir();

        System.out.println("Topo: " + pilhaE.topo());

        pilhaE.desempilhar();
        pilhaE.imprimir();


        System.out.println("\n=== PILHA DINÂMICA ===");

        PilhaDinamica pilhaD = new PilhaDinamica();

        pilhaD.empilhar(100);
        pilhaD.empilhar(200);
        pilhaD.empilhar(300);

        pilhaD.imprimir();

        System.out.println("Topo: " + pilhaD.topo());

        pilhaD.desempilhar();
        pilhaD.imprimir();
    }
}