package Arrays;

import java.util.Scanner;

public class arrays6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        double sumaNegativos = 0;
        double sumaPositivos = 0;
        int contadorNegativos = 0;
        int contadorPositivos = 0;
        for (int numero : numeros) {
            if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;
            } else if (numero > 0) {
                sumaPositivos += numero;
                contadorPositivos++;
            }
        }
        double mediaNegativos = contadorNegativos > 0 ? sumaNegativos / contadorNegativos : 0;
        double mediaPositivos = contadorPositivos > 0 ? sumaPositivos / contadorPositivos : 0;
        System.out.println("Media de los valores negativos: " + mediaNegativos);
        System.out.println("Media de los valores positivos: " + mediaPositivos);
    }
}
