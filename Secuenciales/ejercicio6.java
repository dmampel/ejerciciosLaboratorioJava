import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> materias = insertarMaterias(sc);
        plan(sc, materias);

    }

    public static ArrayList insertarMaterias(Scanner sc) {
        ArrayList<String> materias = new ArrayList<>();
        String respuesta = " ";
        do{

            System.out.println("Querés ingresar una materia?");
            respuesta = sc.next();
            if(respuesta.equals("no")){
                break;
            }
            System.out.println("Escribe el nombre de la materia por favor.");
            String materia= sc.next();
            materias.add(materia);


        } while(true);

        return materias;
    }
    public static void plan(Scanner sc, ArrayList<String> materias){
        System.out.println("Por favor, indicanos cuántas horas podés estudiar en la semana.");
        int horas = sc.nextInt();
        int horasPorMateria = horas / materias.size();
        int horasRestantes = horas % materias.size();
        for (int i = 0; i < materias.size(); i++) {

            int horasAsignadas = horasPorMateria;
            if (i < horasRestantes) {
                horasAsignadas++;
            }
            System.out.println(materias.get(i) + ": " + horasAsignadas + " horas");
        }
    }
}




