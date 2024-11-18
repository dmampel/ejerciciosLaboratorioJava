package Arrays;

public class arrays4 {
    public static void main(String[] args) {
        int[] pares = new int[20];
        for (int i = 0; i < 20; i++) {
            pares[i] = 2 * (i + 1);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(pares[i]);
        }
    }
}
