package Trabalho_02;

public class ValidadorPilha {

    // Valida tamanho da pilha
    public static void validarTamanho(int tamanho) {
        if (tamanho <= 0) {
            throw new IllegalArgumentException("Tamanho deve ser maior que zero");
        }
    }

    // Verifica overflow (pilha cheia)
    public static void validarOverflow(boolean estaCheia) {
        if (estaCheia) {
            throw new RuntimeException("Erro: Pilha cheia (overflow)");
        }
    }

    // Verifica underflow (pilha vazia)
    public static void validarUnderflow(boolean estaVazia) {
        if (estaVazia) {
            throw new RuntimeException("Erro: Pilha vazia (underflow)");
        }
    }
}