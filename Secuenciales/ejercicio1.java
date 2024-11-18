import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento en formato dd/mm/yyyy.");
        String nacimiento = sc.next();
        String[] separar = nacimiento.split("/");


        int dia = Integer.parseInt(separar[0]);
        int mes = Integer.parseInt(separar[1]);

        String signo = "";
        String lectura = "";

        horoscopo(signo, lectura, dia, mes);

    }

    public static void horoscopo(String signo, String lectura, int dia, int mes) {

        if((mes == 1 && dia > 19) || (mes == 2 && dia < 19 )){
            signo = "Acuario";
            lectura = "Ideas innovadoras te llevarán lejos. Participa en causas sociales o proyectos creativos, tu mente está en expansión.";

        }else if((mes == 2 && dia > 18) || (mes == 3 && dia < 20 )){
            signo = "Picis";
            lectura = "Sueños y emociones a flor de piel. Aprovecha tu sensibilidad para conectar con los demás y planifica un descanso.";

        }else if((mes == 3 && dia > 20) || (mes == 4 && dia < 19 )){
            signo="Aries";
            lectura = "Energía y entusiasmo te rodean, pero no te apresures demasiado. Toma tiempo para pensar antes de actuar.";

        }else if((mes == 4 && dia > 19) || (mes == 5 && dia < 20 )){
            signo = "Tauro";
            lectura = "Las relaciones personales mejoran. Aprecia las pequeñas cosas y mantén el equilibrio en tus finanzas.";

        }else if ((mes == 5 && dia > 20) || (mes == 6 && dia < 19 )){
            signo = "Geminis";
            lectura="La comunicación será clave esta semana. Aprovecha tu ingenio para resolver conflictos y proyectos laborales.";

        }else if((mes == 6 && dia > 20) || (mes == 7 && dia < 23 )){
            signo = "Cáncer";
            lectura = "Estabilidad emocional en camino. Acepta cambios en el trabajo o la vida personal sin miedo.";

        }else if((mes == 7 && dia > 22) || (mes == 8 && dia < 23 )){
            signo = "Leo";
            lectura = "Proyectos creativos florecen. Es un buen momento para tomar riesgos calculados en el trabajo o relaciones.";

        }else if((mes == 8 && dia > 22) || (mes == 9 && dia < 23 )){
            signo="Virgo";
            lectura="Organiza tus prioridades. Tienes muchas tareas, pero mantente tranquilo y evita el perfeccionismo excesivo.";

        }else if((mes == 9 && dia > 22) || (mes == 10 && dia < 23 )){
            signo="Libra";
            lectura="Semana armoniosa para el amor y la amistad. Céntrate en tus relaciones personales y equilibra tu vida social.";

        } else if((mes == 10 && dia > 22) || (mes == 11 && dia < 22 )) {
            signo = "Escorpio";
            lectura = "Momento para introspección. Escucha tu intuición, pero no te aísles demasiado. En el trabajo, sigue tu instinto.";

        }else if((mes == 11 && dia > 21) || (mes == 12 && dia < 22 )){
            signo = "Sagitario";
            lectura = "Momento para introspección. Escucha tu intuición, pero no te aísles demasiado. En el trabajo, sigue tu instinto.";

        }else if((mes == 12 && dia > 21) || (mes == 1 && dia < 20 )){
            signo = "Capricornio";
            lectura = "Esfuerzos en el trabajo dan frutos. Mantén tu disciplina, pero no olvides cuidar tu bienestar emocional.";
        }

        System.out.println("Tu signo es: " + signo);
        System.out.println("Aquí está la lectura de "+signo+" de este mes: " + lectura);

    }
}
