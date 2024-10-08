import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = sc.nextDouble();
        System.out.print("Ingresa tu altura en metros: ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Tu IMC es: " + imc);

        calcularIMC(peso, altura, imc);
    }

    public static void calcularIMC(double peso, double altura, double imc) {
        if (imc < 18.5) {
            System.out.println("Observación: Bajo peso. Deberías aumentar la ingesta calórica");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Observación: Peso normal. ");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Observación: Sobrepeso. Aumenta la actividad física");
        } else {
            System.out.println("Observación: Obesidad. Consulta médica urgente!");
        }
    }
}
