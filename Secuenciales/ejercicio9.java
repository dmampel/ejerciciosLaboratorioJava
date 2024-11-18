import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántas horas al día duermes?: ");
        int horasSueño = sc.nextInt();
        System.out.print("¿Cuántas horas al día haces ejercicio?: ");
        int horasEjercicio = sc.nextInt();
        System.out.print("¿Cuántas comidas saludables consumes al día?: ");
        int comidasSaludables = sc.nextInt();

        evaluarHabitos(horasSueño, horasEjercicio, comidasSaludables);
    }

    public static void evaluarHabitos(int horasSueño, int horasEjercicio, int comidasSaludables) {
        if (horasSueño >= 7 && horasSueño <= 9) {
            System.out.println("Sueño: Tienes buenos hábitos de sueño.");
        } else if (horasSueño < 7) {
            System.out.println("Sueño: Estás durmiendo poco. Intenta descansar más.");
        } else {
            System.out.println("Sueño: Estás durmiendo demasiado.");
        }

        if (horasEjercicio >= 1) {
            System.out.println("Ejercicio: Excelente, haces suficiente ejercicio.");
        } else {
            System.out.println("Ejercicio: Deberías hacer más ejercicio.");
        }

        if (comidasSaludables >= 3) {
            System.out.println("Comidas Saludables: Tienes buenos hábitos alimenticios.");
        } else {
            System.out.println("Comidas Saludables: Intenta consumir más comidas saludables.");
        }
    }
}
