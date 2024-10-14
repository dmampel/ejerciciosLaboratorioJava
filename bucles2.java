import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class bucles2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema.");
        HashMap <String, Integer> empleados = new HashMap();
        empleados = ingresarEmpleados(sc);
        mostrar(empleados);

    }

    public static HashMap<String, Integer> ingresarEmpleados(Scanner sc) {

        HashMap<String, Integer> empleados = new HashMap<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el nombre del empleado");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la cantidad de horas trabajadas.");
            int horas = sc.nextInt();
            empleados.put(nombre, horas);
            System.out.println("¿Desea añadir otro empleado? 1-para continuar. 2-para salir.");
            if (sc.nextInt() == 2) {continuar = false;}
            sc.nextLine();
        }

        return empleados;
    }

    public static void mostrar(HashMap<String, Integer> empleados) {
        double salario = 0;
        int horasExtras = 0;
        int horasNormales = 0;
        for (HashMap.Entry<String, Integer> entry : empleados.entrySet()) {
            String nombre = entry.getKey();
            int horas = entry.getValue();
            System.out.println(nombre + ": " + horas+" horas trabajadas");

            if(horas > 40){
                horasExtras = horas - 40;
                horasNormales = horas - horasExtras;
                salario = (horasNormales * 15) + (horasExtras * 20);
                System.out.println("Realizó "+horasExtras+" horas extras.");
            }else{
                salario = horas * 15;
                System.out.println("No realizó horas extras.");
            }

            System.out.println("El salario de "+entry.getKey()+" es de "+salario+" pesos.");
        }
    }
}
