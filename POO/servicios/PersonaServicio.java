package POO.servicios;

import POO.entidades.Persona;

import java.util.Scanner;

public class PersonaServicio {
    Scanner sc = new Scanner(System.in);

    public Persona ingresar(){
        Persona persona = new Persona();

        System.out.println("Ingresá tu nombre");
        persona.setNombre(sc.nextLine());
        System.out.println("Ingresá tu apellido");
        persona.setApellido(sc.nextLine());
        System.out.println("Ingresá tu edad");
        persona.setEdad(sc.nextInt());
        System.out.println("Ingresá tu dni");
        persona.setDni(sc.nextInt());

        return persona;
    }

    public void mostrar(Persona p){
        System.out.println(p.getNombre());
        System.out.println(p.getApellido());
        System.out.println(p.getEdad());
        System.out.println(p.getDni());

    }
}
