import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cúal es tu género favorito? 1- Acción 2-Comedia 3-Drama 4-Ciencia Ficción 5-Documentales");
        int opcion = sc.nextInt();

        recomendarPeliculas(opcion);
        recomendarLibros(opcion);



    }
    public static void recomendarPeliculas(int opcion) {
        switch (opcion) {
            case 1:
                    System.out.println("Te recomiendo las siguientes películas de acción" +
                            "Mad Max: Fury Road (2015) – Dir. George Miller\n" +
                            "John Wick (2014) – Dir. Chad Stahelski\n" +
                            "Die Hard (1988) – Dir. John McTiernan\n" +
                            "The Dark Knight (2008) – Dir. Christopher Nolan\n" +
                            "Gladiator (2000) – Dir. Ridley Scott");
                    break;
            case 2:
                    System.out.println("Te gusta la comedia? Aquí hay una selección para ti: " +
                            "The Grand Budapest Hotel (2014) – Dir. Wes Anderson\n" +
                            "Groundhog Day (1993) – Dir. Harold Ramis\n" +
                            "Superbad (2007) – Dir. Greg Mottola\n" +
                            "Ferris Bueller's Day Off (1986) – Dir. John Hughes\n" +
                            "Anchorman: The Legend of Ron Burgundy (2004) – Dir. Adam McKay");
                    break;
            case 3:
                    System.out.println("De las mejores de Drama:" +
                            "The Shawshank Redemption (1994) – Dir. Frank Darabont\n" +
                            "Schindler's List (1993) – Dir. Steven Spielberg\n" +
                            "The Pursuit of Happyness (2006) – Dir. Gabriele Muccino\n" +
                            "A Beautiful Mind (2001) – Dir. Ron Howard\n" +
                            "The Godfather (1972) – Dir. Francis Ford Coppola");
                    break;
            case 4:
                    System.out.println("Estas peliculas te harán volar: " +
                            "Blade Runner 2049 (2017) – Dir. Denis Villeneuve\n" +
                            "Interstellar (2014) – Dir. Christopher Nolan\n" +
                            "The Matrix (1999) – Dir. Lana & Lilly Wachowski\n" +
                            "Inception (2010) – Dir. Christopher Nolan\n" +
                            "Star Wars: A New Hope (1977) – Dir. George Lucas");
                    break;
            case 5:
                    System.out.println("Un documental nunca está de más" +
                            "13th (2016) – Dir. Ava DuVernay\n" +
                            "Free Solo (2018) – Dir. Jimmy Chin, Elizabeth Chai Vasarhelyi\n" +
                            "Planet Earth (2006) – Narrado por David Attenborough\n" +
                            "Won’t You Be My Neighbor? (2018) – Dir. Morgan Neville\n" +
                            "The Social Dilemma (2020) – Dir. Jeff Orlowski");
                    break;
            default:
                    System.out.println("No hay recomendaciones para ti");
        }
    }

    public static void recomendarLibros(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("Te recomiendo los siguientes libros de acción" +
                        "El Conde de Montecristo – Alexandre Dumas\n" +
                        "Los Tres Mosqueteros – Alexandre Dumas\n" +
                        "Bourne Identity – Robert Ludlum\n" +
                        "Cero Cero Cero – Roberto Saviano\n" +
                        "Ready Player One – Ernest Cline (tiene acción junto con ciencia ficción)");
                break;
            case 2:
                System.out.println("Libros que te harán llorar de la risa: " +
                        "Good Omens – Neil Gaiman & Terry Pratchett\n" +
                        "Tres Hombres en una Barca – Jerome K. Jerome\n" +
                        "Catch-22 – Joseph Heller\n" +
                        "Bridget Jones’s Diary – Helen Fielding\n" +
                        "The Hitchhiker's Guide to the Galaxy – Douglas Adams");
                break;
            case 3:
                System.out.println("Libros que te harán llorar:" +
                        "Cien años de soledad – Gabriel García Márquez\n" +
                        "Crimen y Castigo – Fiódor Dostoyevski\n" +
                        "Las uvas de la ira – John Steinbeck\n" +
                        "El Gran Gatsby – F. Scott Fitzgerald\n" +
                        "Matar a un ruiseñor – Harper Lee");
                break;
            case 4:
                System.out.println("Libros de ciencia ficción: " +
                        "Dune – Frank Herbert\n" +
                        "Fahrenheit 451 – Ray Bradbury\n" +
                        "Neuromante – William Gibson\n" +
                        "1984 – George Orwell\n" +
                        "La guerra de los mundos – H.G. Wells");
                break;
            case 5:
                System.out.println("Documentales escritos" +
                        "Sapiens: De animales a dioses – Yuval Noah Harari\n" +
                        "Homo Deus – Yuval Noah Harari\n" +
                        "Educated (Una educación) – Tara Westover\n" +
                        "The Immortal Life of Henrietta Lacks – Rebecca Skloot\n" +
                        "Cosmos – Carl Sagan");
                break;
            default:
                System.out.println("No hay recomendaciones para ti");
        }
    }
}
