package Arrays;

import java.util.Scanner;

public class arrays7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de alturas: ");
        int n = sc.nextInt();
        double[] alturas = new double[n];
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la altura " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();
            suma += alturas[i];
        }
        double media = suma / n;
        int superiores = 0;
        int inferiores = 0;
        for (double altura : alturas) {
            if (altura > media) {
                superiores++;
            } else if (altura < media) {
                inferiores++;
            }
        }
        System.out.println("Altura media: " + media);
        System.out.println("Alturas superiores a la media: " + superiores);
        System.out.println("Alturas inferiores a la media: " + inferiores);
    }
}
