import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Buenos días. Por favor indique su nivel de ejercicio.");
        System.out.println("Siendo: 1- Nivel inicial. 2- Nivel intermedio. 3- Nivel avanzado");
        int n = sc.nextInt();

        generarRutina(n);

    }

    public static void generarRutina(int n){
        switch (n){
            case 1:
                System.out.println("Rutina para Principiantes\n" +
                        "Lunes – Piernas y Cardio (40 min)\n" +
                        "Calentamiento (5 min)\n" +
                        "\n" +
                        "Caminata en el lugar\n" +
                        "Estiramientos ligeros de piernas\n" +
                        "Entrenamiento de Piernas (25 min)\n" +
                        "\n" +
                        "Sentadillas con peso corporal (3 series de 10 repeticiones)\n" +
                        "Zancadas con peso corporal (3 series de 8 por pierna)\n" +
                        "Elevaciones de talones (3 series de 12 repeticiones)\n" +
                        "Cardio Suave (10 min)\n" +
                        "\n" +
                        "Caminar rápido o trotar suave\n" +
                        "Martes – Tren Superior y Core (40 min)\n" +
                        "Calentamiento (5 min)\n" +
                        "\n" +
                        "Rotaciones de brazos y torso\n" +
                        "Entrenamiento de Fuerza (Tren Superior) (25 min)\n" +
                        "\n" +
                        "Flexiones modificadas (apoyando las rodillas) (3 series de 8 repeticiones)\n" +
                        "Remo con botellas de agua o mancuernas ligeras (3 series de 10)\n" +
                        "Curl de bíceps con botellas de agua (3 series de 10)\n" +
                        "Core (10 min)\n" +
                        "\n" +
                        "Plancha de 15 segundos (3 series)\n" +
                        "Crunches (3 series de 12 repeticiones)\n" +
                        "Miércoles – Cardio y Flexibilidad (30 min)\n" +
                        "Cardio Suave (20 min)\n" +
                        "\n" +
                        "Caminata a paso rápido o bicicleta\n" +
                        "Estiramientos Básicos (10 min)\n" +
                        "\n" +
                        "Estiramientos de piernas, espalda y brazos\n" +
                        "Jueves – Full Body (45 min)\n" +
                        "Calentamiento (5 min)\n" +
                        "\n" +
                        "Circuito Full Body (30 min)\n" +
                        "\n" +
                        "Sentadillas con peso corporal (3 series de 10)\n" +
                        "Flexiones modificadas (3 series de 8)\n" +
                        "Planchas de 15-20 segundos\n" +
                        "Puente de glúteos (3 series de 12)\n" +
                        "Enfriamiento y Estiramientos (10 min)\n" +
                        "\n" +
                        "Viernes – Piernas y Core (40 min)\n" +
                        "Calentamiento (5 min)\n" +
                        "\n" +
                        "Entrenamiento de Fuerza (Piernas y Core) (30 min)\n" +
                        "\n" +
                        "Zancadas con peso corporal (3 series de 10 por pierna)\n" +
                        "Elevación de talones (3 series de 12)\n" +
                        "Plancha (20 segundos x 3)\n" +
                        "Sábado – Cardio y Movilidad (30 min)\n" +
                        "Cardio Suave (20 min)\n" +
                        "\n" +
                        "Caminar rápido o bicicleta\n" +
                        "Estiramientos Dinámicos (10 min)\n" +
                        "\n" +
                        "Movimientos suaves de yoga y estiramientos ligeros.\n" +
                        "Domingo – Descanso Activo\n" +
                        "Caminar, pasear o estiramientos ligeros.");
                break;

            case 2:
                System.out.println("Rutina para Nivel Intermedio\n" +
                        "Lunes – Piernas y Cardio (60 min)\n" +
                        "Calentamiento (10 min)\n" +
                        "\n" +
                        "Entrenamiento de Fuerza (40 min)\n" +
                        "\n" +
                        "Sentadillas con mancuernas (4 series de 12)\n" +
                        "Peso muerto con mancuernas (4 series de 10)\n" +
                        "Zancadas (4 series de 10 por pierna)\n" +
                        "Cardio HIIT (10 min)\n" +
                        "\n" +
                        "Sprints de 30 segundos, descanso de 30 segundos x 5 series\n" +
                        "Martes – Tren Superior y Core (60 min)\n" +
                        "Calentamiento (10 min)\n" +
                        "\n" +
                        "Entrenamiento de Fuerza (Tren Superior) (40 min)\n" +
                        "\n" +
                        "Flexiones (4 series de 12)\n" +
                        "Press de banca con mancuernas (4 series de 10)\n" +
                        "Remo con mancuernas (4 series de 10)\n" +
                        "Curl de bíceps con mancuernas (3 series de 12)\n" +
                        "Core (10 min)\n" +
                        "\n" +
                        "Plancha (30 segundos x 3)\n" +
                        "Crunches con giro (3 series de 15)\n" +
                        "Miércoles – Cardio y Flexibilidad (45 min)\n" +
                        "Cardio Moderado (30 min)\n" +
                        "\n" +
                        "Correr a ritmo moderado\n" +
                        "Estiramientos (15 min)\n" +
                        "\n" +
                        "Estiramientos de piernas, espalda y brazos\n" +
                        "Jueves – Full Body (60 min)\n" +
                        "Calentamiento (10 min)\n" +
                        "\n" +
                        "Circuito Full Body (40 min)\n" +
                        "\n" +
                        "Burpees (4 series de 10)\n" +
                        "Kettlebell swings (4 series de 15)\n" +
                        "Flexiones (4 series de 12)\n" +
                        "Puentes de glúteos (4 series de 12)\n" +
                        "Estiramientos (10 min)\n" +
                        "\n" +
                        "Viernes – Piernas y Core (60 min)\n" +
                        "Calentamiento (10 min)\n" +
                        "\n" +
                        "Entrenamiento de Fuerza (Piernas y Core) (40 min)\n" +
                        "\n" +
                        "Prensa de piernas (4 series de 12)\n" +
                        "Zancadas con mancuernas (4 series de 10 por pierna)\n" +
                        "Elevaciones de talones (4 series de 15)\n" +
                        "Plancha lateral (30 segundos por lado x 3)\n" +
                        "Sábado – Cardio Intenso y Movilidad (45 min)\n" +
                        "HIIT Cardio (30 min)\n" +
                        "\n" +
                        "30 segundos sprint, 30 segundos caminata x 10 series\n" +
                        "Estiramientos (15 min)\n" +
                        "\n" +
                        "Domingo – Descanso Activo\n" +
                        "Caminar, andar en bicicleta a ritmo suave.\n");
                break;

            case 3:
                System.out.println("Rutina para Nivel Avanzado\n" +
                        "Lunes – Piernas y Cardio (90 min)\n" +
                        "Calentamiento (15 min)\n" +
                        "\n" +
                        "Correr ligero y estiramientos dinámicos\n" +
                        "Entrenamiento de Fuerza (Piernas) (60 min)\n" +
                        "\n" +
                        "Sentadillas con barra (5 series de 10)\n" +
                        "Peso muerto (5 series de 8)\n" +
                        "Sentadilla búlgara con mancuernas (4 series de 12 por pierna)\n" +
                        "Zancadas caminando (4 series de 12 por pierna)\n" +
                        "Cardio HIIT (15 min)\n" +
                        "\n" +
                        "Sprints de 30 segundos, descanso 30 segundos x 8\n" +
                        "Martes – Tren Superior y Core (90 min)\n" +
                        "Calentamiento (15 min)\n" +
                        "\n" +
                        "Entrenamiento de Fuerza (Tren Superior) (60 min)\n" +
                        "\n" +
                        "Press de banca (5 series de 8)\n" +
                        "Remo con barra (5 series de 8)\n" +
                        "Press militar (4 series de 10)\n" +
                        "Fondos en paralelas (4 series de 12)\n" +
                        "Curl de bíceps con barra (4 series de 10)\n" +
                        "Extensiones de tríceps (4 series de 10)\n" +
                        "Core Avanzado (15 min)\n" +
                        "\n" +
                        "Plancha (1 min x 3)\n" +
                        "Elevación de piernas (4 series de 12)\n" +
                        "Bicicleta (4 series de 20)\n" +
                        "Miércoles – Cardio y Flexibilidad (60 min)\n" +
                        "Cardio Moderado (40 min)\n" +
                        "\n" +
                        "Correr a ritmo moderado\n" +
                        "Movilidad y Yoga (20 min)\n" +
                        "\n" +
                        "Movimientos de yoga para flexibilidad y movilidad articular\n" +
                        "Jueves – Full Body (90 min)\n" +
                        "Calentamiento (15 min)\n" +
                        "\n" +
                        "Circuito Full Body Intenso (60 min)\n" +
                        "\n" +
                        "Burpees (5 series de 12)\n" +
                        "Kettlebell swings (5 series de 20)\n" +
                        "Sentadillas con salto (4 series de 15)\n" +
                        "Flexiones con palmada (4 series de 12)\n" +
                        "Mountain climbers (4 series de 20)\n" +
                        "Enfriamiento (15 min)\n" +
                        "\n" +
                        "Viernes – Piernas y Core (90 min)\n" +
                        "Calentamiento (15 min)\n" +
                        "\n" +
                        "Entrenamiento de Fuerza (Piernas y Core) (60 min)\n" +
                        "\n" +
                        "Prensa de piernas (5 series de 10)\n" +
                        "Zancadas con barra (5 series de 10 por pierna)\n" +
                        "Peso muerto rumano (4 series de 12)\n" +
                        "Plancha lateral (45 segundos x 3)\n" +
                        "Cardio Suave (15 min)\n" +
                        "\n" +
                        "Sábado – Cardio Intenso y Movilidad (60 min)\n" +
                        "HIIT Cardio (30 min)\n" +
                        "\n" +
                        "Sprints de 45 segundos con descanso de 30 segundos x 10\n" +
                        "Estiramientos Profundos (30 min)\n" +
                        "\n" +
                        "Yoga y estiramientos de flexibilidad avanzada\n" +
                        "Domingo – Descanso Activo\n" +
                        "Caminar, trotar suave, o bicicleta a ritmo relajado.");
                break;

            default:
                System.out.println("Esa opción no está contemplada.");
                break;
        }
    }
}
