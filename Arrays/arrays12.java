package Arrays;

public class arrays12 {
    public static void main(String[] args) {
        int[][] cuadradoMagico = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cuadradoMagico[i][j] + " ");
            }
            System.out.println();
        }
    }
}
