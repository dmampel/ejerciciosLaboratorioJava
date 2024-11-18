package POO.servicios;

import POO.entidades.Planeta;
import java.util.Scanner;

public class PlanetaServicio {

    Scanner sc = new Scanner(System.in);


    public Planeta ingresarPlaneta(){
        Planeta p = new Planeta();

        System.out.println("Ingrese nombre del planeta");
        p.setNombre(sc.nextLine());
        System.out.println("Ingrese la cantidad de satelites del planeta");
        p.setSatelites(sc.nextInt());
        System.out.println("Ingrese la masa.");
        p.setMasa(sc.nextDouble());
        System.out.println("Ingrese el volumen.");
        p.setVolumen(sc.nextDouble());
        System.out.println("Ingrese el diametro.");
        p.setDiametro(sc.nextInt());
        System.out.println("Ingrese la distancia al sol.");
        p.setDistanciaSol(sc.nextInt());
        System.out.println("Ingrese el tipo de planeta (GASEOSO, TERRESTRE, ENANO):");
        sc.nextLine();
        String tipoStr = sc.nextLine().toUpperCase();
        try {
            p.setTipo(Planeta.TipoPlaneta.valueOf(tipoStr));
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de planeta no válido. Se asignará TERRESTRE por defecto.");
            p.setTipo(Planeta.TipoPlaneta.TERRESTRE);
        }

        System.out.println("¿Es visible? (true/false):");
        try{
            p.setVisible(sc.nextBoolean());
        } catch (Exception e) {
            System.out.println("Tipo de dato no válido. Se asignará False por defecto.");
            p.setVisible(false);
        }






        return p;
    }

    public void mostrarPlaneta(Planeta p){

        System.out.println("Nombre del planeta: " + p.getNombre());
        System.out.println("Satelites del planeta: " + p.getSatelites());
        System.out.println("Masa del planeta: " + p.getMasa());
        System.out.println("Volumen: " + p.getVolumen());
        System.out.println("Diametro: " + p.getDiametro());
        System.out.println("Distancia del planeta: " + p.getDistanciaSol());
        System.out.println("Tipo de planeta: " + p.getTipo());
        System.out.println("Visible: " + p.isVisible());


    }

    public double calcularDensidad(Planeta p){

        double densidad = p.getMasa() / p.getVolumen();

        return densidad;
    }

    public boolean esExterior(Planeta p){

        boolean exterior = false;

        if(p.getDistanciaSol() > 3 * 149597870 ){
            exterior = true;
        }

        return exterior;

    }
}
