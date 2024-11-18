package Arrays;

import java.util.Random;

public class arrays9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = rand.nextInt(100); // Números aleatorios entre 0 y 99
        }
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
