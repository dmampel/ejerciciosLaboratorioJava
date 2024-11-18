package POO.mains;

import POO.entidades.Alumno;
import POO.servicios.AlumnoServicio;

import java.util.ArrayList;

public class mainAlumno {
    public static void main(String[] args) {

        AlumnoServicio as = new AlumnoServicio();
        ArrayList <Alumno> alumnos = new ArrayList();
        alumnos = as.cargarAlumnos(2);
        as.mostrarAlumnos(alumnos);


    }
}
