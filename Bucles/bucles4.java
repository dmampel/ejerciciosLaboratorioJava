import java.util.HashMap;
import java.util.Scanner;

public class bucles4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> ventas = new HashMap<>();
        ventas = ingresarVentas(sc);
        mostrar(ventas);

    }

    public static HashMap<String, Integer> ingresarVentas(Scanner sc) {

        HashMap<String, Integer> registro = new HashMap();
        for (int i = 0; i < 7; i++) {

            System.out.println("Ingrese el día de la semana.");
            String dia = sc.nextLine();
            System.out.println("Ingrese la cantidad de ventas realizadas.");
            int ventas = sc.nextInt();
            registro.put(dia, ventas);
            sc.nextLine();

        }

        return registro;
    }

    public static void mostrar(HashMap<String, Integer> ventas) {
        int total = 0;
        for (HashMap.Entry<String, Integer> entry : ventas.entrySet()) {

            total += entry.getValue();
            String dia = entry.getKey().toUpperCase();
            int venta = entry.getValue();
            System.out.println(dia + ": " + venta+ " ventas.");

        }
        System.out.println("Realizaste " + total+ " ventas en la semana.");
    }

}
