package POO.entidades;

import java.lang.reflect.Array;
import java.util.ArrayList;
import POO.entidades.Nota;

public class Alumno {

    String nombreCompleto;
    long legajo;
    ArrayList<Nota> notas;

    public Alumno() {
        this.notas = new ArrayList<>();
    }

    public Alumno(String nombreCompleto, long legajo, ArrayList<Nota> notas) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = notas;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getLegajo() {
        return legajo;
    }

    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", legajo=" + legajo +
                ", notas=" + notas +
                '}';
    }
}
