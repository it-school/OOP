package itschool;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final int SIZE = 4;
        int r = 0, c = 0, n = 1, dC = 1, dR = 0;

        int[][] array = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(array[i], 0);
        }

        for (int i = 0; i < SIZE * SIZE; i++) {
            array[r][c] = n++;
            r += dR;
            c += dC;

            if (c == -1 || (r <= SIZE && dR == 1 && array[r][c] != 0)) {
                dC = 0;
                dR = -1;
                c++;
            }

            if (r == -1 || array[r][c] != 0) {
                dC = 1;
                dR = 0;
                r++;
            }

            if (array[r][c] != 0 || c == SIZE-1) {
                dC = 0;
                dR = 1;
            }

            if (array[r][c] != 0 || r == SIZE) {
                dC = -1;
                dR = 0;
            }


            for (int q = 0; q < SIZE; q++) {
                for (int w = 0; w < SIZE; w++) {
                    System.out.print(array[q][w] + "\t");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
