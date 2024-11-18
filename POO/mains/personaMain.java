package POO.mains;

import POO.entidades.Persona;
import POO.servicios.PersonaServicio;
import java.util.Scanner;

public class personaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PersonaServicio ps = new PersonaServicio();
        Persona persona = ps.ingresar();
        ps.mostrar(persona);



    }
}
