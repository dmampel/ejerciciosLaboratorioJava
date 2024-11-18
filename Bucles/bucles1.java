import java.util.ArrayList;
import java.util.Scanner;

public class bucles1 {
    public static void main(String[] args) {
        System.out.println("Buenas, bienvenido al registro de actividades.");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> actividades = new ArrayList<>();
        actividades = ingresarActividad(sc);
        mostrar(actividades);
        registrarHoras(sc, actividades);

    }

    public static ArrayList ingresarActividad(Scanner sc) {
        System.out.println("Vamos a registrar tus actividades.");
        ArrayList<String> actividades = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el actividad que desea registrar: ");
            actividades.add(sc.nextLine().toUpperCase());
            System.out.println("Ingrese: 1- para añadir otra actividad. 2- para salir.");
            if (sc.nextInt() == 2) {continuar = false;}
            sc.nextLine();
        }

        return actividades;

    }

    public static void mostrar(ArrayList lista) {

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void registrarHoras(Scanner sc, ArrayList<String> actividades) {

        ArrayList<Integer> horas = new ArrayList<>();
        int horasTotales = 0;

        for (int i = 0; i < actividades.size(); i++) {
            System.out.println("¿Cúantas horas le dedicas a "+ actividades.get(i) +" en el día?");
            horas.add(sc.nextInt());
            horasTotales += horas.get(i);
        }

        System.out.println("El total de horas dedicado es de "+horasTotales+ " horas");
    }

}
