package POO.entidades;

public class Nota {

    String catedra;
    double notaExamen;

    public Nota(){}

    public Nota(String catedra, double notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;

    }

    public String getCatedra() {
        return catedra;
    }

    public void setCatedra(String catedra) {
        this.catedra = catedra;
    }

    public double getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(double notaExamen) {
        this.notaExamen = notaExamen;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "catedra='" + catedra + '\'' +
                ", notaExamen=" + notaExamen +
                '}';
    }
}
