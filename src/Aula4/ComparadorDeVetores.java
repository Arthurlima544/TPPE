package Aula4;

import java.util.Arrays;

public class ComparadorDeVetores {

    public static boolean compararVetores(int[] vetor1, Numero[] vetor2) {
        if (vetor1 == null || vetor2 == null) {
            return false;
        }

        if (vetor1.length != vetor2.length) {
            return false;
        }

        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] != vetor2[i].getNumero()) {
                return false;
            }
        }
        System.out.println("\u001B[31m" +Arrays.toString(vetor1) + "\u001B[0m" + " <-- Vetor 1 e Vetor 2 --> " + "\u001B[34m" +   Arrays.toString(vetor2)+ "\u001B[0m");
        return true;
    }
}