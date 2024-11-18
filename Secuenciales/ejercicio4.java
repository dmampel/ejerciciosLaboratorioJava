import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Buenos días, cómo te sientes hoy?");
        System.out.println("A: Feliz B: Triste C: Motivado D: Relajado");
        String animo = sc.next();

        generarPlaylist(animo);
    }

    public static void generarPlaylist(String animo){
        switch (animo.toUpperCase()){
            case "A":
                    System.out.println("Estas Feliz! Aquí está tu playlist.\n" +
                            "\"Happy\" – Pharrell Williams\n" +
                            "\"Can't Stop the Feeling\" – Justin Timberlake\n" +
                            "\"Uptown Funk\" – Mark Ronson ft. Bruno Mars\n" +
                            "\"Walking on Sunshine\" – Katrina and the Waves\n" +
                            "\"Good as Hell\" – Lizzo");
                    break;
            case "B":
                    System.out.println("Lamento que estés Triste, espero que esta playlist te haga sentir mejor. \n" +
                            "\"Someone Like You\" – Adele\n" +
                            "\"Hurt\" – Johnny Cash\n" +
                            "\"All I Want\" – Kodaline\n" +
                            "\"Fix You\" – Coldplay\n" +
                            "\"Skinny Love\" – Bon Iver");
                    break;
            case "C":
                    System.out.println("Espero que con estas canciónes aproveches tu motivación al máximo.\n" +
                            "\"Eye of the Tiger\" – Survivor\n" +
                            "\"Lose Yourself\" – Eminem\n" +
                            "\"Stronger\" – Kanye West\n" +
                            "\"Don't Stop Me Now\" – Queen\n" +
                            "\"Run the World (Girls)\" – Beyoncé");
                    break;
            case "D":
                    System.out.println("Esta lista es perfecta para un momento de paz.\n" +
                            "\"Weightless\" – Marconi Union\n" +
                            "\"Sunset Lover\" – Petit Biscuit\n" +
                            "\"Breathe Me\" – Sia\n" +
                            "\"Holocene\" – Bon Iver\n" +
                            "\"Lost in Japan\" – Shawn Mendes (Acoustic)");
                    break;
            default:
                    System.out.println("Lo siento, no tenemos canciones para ti en este momento.");
                    break;
        }

    }
}
