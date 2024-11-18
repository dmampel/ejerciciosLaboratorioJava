package Arrays;

import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int n = sc.nextInt();
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            double numero = sc.nextDouble();
            suma += numero;
        }
        double media = suma / n;
        System.out.println("La media de los números es: " + media);
    }
}
