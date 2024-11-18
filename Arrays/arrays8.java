package Arrays;

import java.util.Scanner;

public class arrays8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[20];
        double[] sueldos = new double[20];
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            sueldos[i] = sc.nextDouble();
            sc.nextLine(); // Consumir la nueva línea pendiente
        }
        int maxIndex = 0;
        for (int i = 1; i < 20; i++) {
            if (sueldos[i] > sueldos[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("El empleado que más gana es: " + nombres[maxIndex] + " con un sueldo de " + sueldos[maxIndex]);
    }
}
