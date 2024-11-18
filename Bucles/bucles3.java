import java.util.HashMap;
import java.util.Scanner;

public class bucles3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <String, Integer> inventario = new HashMap<>();

        inventario = crearInventario(sc);
        mostrar(inventario);


    }

    public static HashMap <String, Integer> crearInventario(Scanner sc) {

        HashMap <String, Integer> productos = new HashMap();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el nombre del producto");
            String nombre = sc.nextLine();
            System.out.println("Ingrese la cantidad de stock del producto.");
            int stock = sc.nextInt();
            productos.put(nombre, stock);
            System.out.println("¿Desea añadir otro producto? 1-para continuar. 2-para salir.");
            if (sc.nextInt() == 2) {continuar = false;}
            sc.nextLine();
        }


        return productos;


    }

    public static void mostrar(HashMap<String, Integer> productos) {

        for (HashMap.Entry<String, Integer> entry : productos.entrySet()) {
            String producto = entry.getKey();
            int stock = entry.getValue();
            System.out.println(producto + ": " + stock);
            if( stock <= 5 ){
                System.out.println("Deberías adquirir más stock.");
            }
        }
    }
}
