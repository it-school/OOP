package itschool;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
/*
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
*/
        final int SIZE = 100;
        int[] a = new int [SIZE];
        int[] b = new int [SIZE];

        for (int i = 0; i < SIZE; i++) {
            a[i] = (int)(Math.random()*100);
        }

        System.out.println(Arrays.toString(a));

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
/*
        for (int item : a)
        {
            if (item % 2 == 0)
                System.out.println(item);
        }
*/

        int temp;
        for (int i = 0; i < a.length/2; i++)
        {
            temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(a));


        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int n = Arrays.binarySearch(a, 62);
        System.out.println(n >= 0 ? n : "No such element");

        //b = a;
        b = Arrays.copyOf(a, SIZE);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        //b[0] = 100;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        if (a == b)
            System.out.println("Equal");

        if (Arrays.equals(a, b))
            System.out.println("Equal");

    }
}
