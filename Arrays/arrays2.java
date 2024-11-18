package Arrays;

import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < 10; i += 2) {
            suma += numeros[i];
            contador++;
        }
        double media = suma / contador;
        System.out.println("La media de los números en posiciones pares es: " + media);
    }
}
