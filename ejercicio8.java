import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el precio del producto.");
        double precio = sc.nextDouble();
        System.out.println("¿A qué categoría perteneces? 1-Estudiante 2-Adulto 3-Jubilado");
        int categoria = sc.nextInt();
        calcularDesc(precio, categoria);
    }

    public static void calcularDesc(double precio, int categoria) {
        double descuento = 0;
        double precioFin = 0;
        switch (categoria) {
            case 1:
                    descuento = (precio * 10) / 100;
                    precioFin = precio - descuento;
                    break;
            case 2:
                    descuento = (precio * 5) / 100;
                    precioFin = precio - descuento;
                    break;
            case 3:
                    descuento = (precio * 15) / 100;
                    precioFin = precio - descuento;
                    break;
            default:
                    System.out.println("Opción inválida");
        }

        System.out.println("El precio final es de " +precioFin+ " pesos, aplicando un descuento de "+descuento+ " pesos.");
    }
}
