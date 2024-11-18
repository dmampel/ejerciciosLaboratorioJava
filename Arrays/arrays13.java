package Arrays;

public class arrays13 {
    public static void main(String[] args) {
        int[][] cuadradoLatino = {
                {1, 2, 3},
                {2, 3, 1},
                {3, 1, 2}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cuadradoLatino[i][j] + " ");
            }
            System.out.println();
        }
    }
}
