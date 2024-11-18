import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a calcular el costo de tu viaje. Para esto, por favor indicar:");
        System.out.println("El consumo de tu vehiculo en litros por kilómetro");
        double consumoNafta = sc.nextDouble();
        System.out.println("El precio del combustible por litro");
        double combustible = sc.nextDouble();
        System.out.println("La distancia del viaje en kilómetros");
        double distancia = sc.nextDouble();

        calcularViaje(consumoNafta, combustible, distancia);

    }

    public static void calcularViaje(double consumoNafta, double combustible, double distancia) {

        double costoFinal = (distancia / consumoNafta) * combustible;

        System.out.println("Siendo la distancia: "+distancia+" km, con un consumo de " +consumoNafta+" l/km, con un costo de "+combustible+" el costo total del viaje es de "+costoFinal+" pesos.");

    }
}
