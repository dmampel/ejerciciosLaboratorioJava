package Bucles;

public class bucles7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = sc.nextInt();
        long suma = 0;
        for (int i = 0; i <= N; i++) {
            suma += factorial(i);
        }
        System.out.println("La suma de los factoriales de 0 hasta " + N + " es: " + suma);
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
