package POO.mains;


import POO.entidades.Planeta;
import POO.servicios.PlanetaServicio;
import java.util.Scanner;

public class planetaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PlanetaServicio ps = new PlanetaServicio();
        Planeta planeta = new Planeta("Jupiter", 7, 4587, 1562, 458, 999991171, Planeta.TipoPlaneta.GASEOSO, false);
        ps.mostrarPlaneta(planeta);
        double densidad = ps.calcularDensidad(planeta);
        System.out.println("La densidad del planeta es de "+densidad);
        boolean exterior = ps.esExterior(planeta);
        if(exterior){
            System.out.println("El planeta es exterior");
        }else {
            System.out.println("El planeta no es exterior");
        }

    }
}
