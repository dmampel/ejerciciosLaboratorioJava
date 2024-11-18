package POO.servicios;

import POO.entidades.Alumno;
import POO.entidades.Nota;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner sc = new Scanner(System.in);

    public ArrayList<Alumno> cargarAlumnos(int cant){

        ArrayList <Alumno> alumnos = new ArrayList();
        ArrayList <Nota> notas = new ArrayList();
        for(int i = 0; i < cant; i++){
            Alumno a = new Alumno();
            System.out.println("Ingresar alumno.");
            System.out.println("Ingrese el nombre completo");
            a.setNombreCompleto(sc.nextLine());
            System.out.println("Ingrese su legajo.");
            a.setLegajo(sc.nextLong());
            System.out.println("Ingrese la cantidad de notas a añadir.");
            int cn = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < cn; j++){
                Nota n = new Nota();
                System.out.println("Ingrese la cátedra");
                n.setCatedra(sc.nextLine());
                System.out.println("Ingrese la nota");
                n.setNotaExamen(sc.nextLong());
                sc.nextLine();
                notas.add(n);

            }
            alumnos.add(a);

        }

        return alumnos;
    }

    public void mostrarAlumnos(ArrayList<Alumno> alumnos){
        for (Alumno a : alumnos){
            System.out.println(a.getNombreCompleto());
            System.out.println(a.getLegajo());
            for (Nota n : a.getNotas()){
                System.out.println(n.getCatedra());
                System.out.println(n.getNotaExamen());
            }
        }
    }

}
