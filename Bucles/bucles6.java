package Bucles;

public class bucles6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = sc.nextInt();
        for (int i = 0; i <= N; i++) {
            System.out.println("Factorial de " + i + " es: " + factorial(i));
        }
    }

    public static long factorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
