import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, bienvenido al contador de calorías.");
        System.out.println("Ingrese su peso en Kilogramos por favor.");
        double peso = sc.nextDouble();
        System.out.println("Ahora, indique la cantidad de tiempo que ejercitaste, en minutos. ");
        double tiempo = sc.nextDouble();
        System.out.println("Por último: seleccione el tipo de ejercicio: 1- Correr /n 2- Andar en bicicleta /n 3- Nadar /n 4-Yoga");
        int disciplina = sc.nextInt();

        calcularCaloriasQuemadas(peso, tiempo, disciplina);

    }

    public static void calcularCaloriasQuemadas(double peso, double tiempo, int disciplina){
        double calQuemadas = 0;
        String actividad = "";
        switch (disciplina){
            case 1: calQuemadas = 10 * peso * (tiempo/60);
            actividad = "corriendo";
            break;

            case 2: calQuemadas = 8 * peso * (tiempo/60);
            actividad = "Andando en bicicleta";
            break;

            case 3: calQuemadas = 7 * peso * (tiempo/60);
            actividad = "nadando";
            break;

            case 4: calQuemadas = 2.5 * peso * (tiempo/60);
            actividad = "haciendo yoga";
            break;

            default:
                System.out.println("Esa opción no está contemplada.");
                break;
        }

        System.out.print("Has quemado " +calQuemadas+ " calorias en "+ tiempo+ " minutos "+actividad+ ".");


    }
}
