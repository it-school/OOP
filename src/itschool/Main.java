package itschool;

public class Main {

    public static void main(String[] args) {


        /*
                double time1 = System.currentTimeMillis();
        double z, y = -10, x = -1000, x2, q = 1234;



        for (x = -1000; x <= 1000; x+=0.001)
        {
            x2 = 3 * x*x - 5;
            int i = 1;


            for (y = -10; y <= 10; y+=0.05)
            {
//                z = (2 * Math.pow(y, 3) + 3 * Math.pow(x, 2) - x * y + 8*y - 5);  // 18000 mS
//                z = (2 * y*y*y + 3 * Math.pow(x, 2) - x * y + 8*y - 5);  // 2450 mS
//                z = (2 * y*y*y + x2 - x * y + 8*y - 5);  // 2450 mS
                z = (2 * y * (y*y + 4 -0.5*x) + x2);  // 2437 mS
            }

        }
        System.out.println(System.currentTimeMillis() - time1);
*/

//        i++; // пост.  // медленнее
//        ++i; // преф.  // быстрее


//        Исходные данные:
        int a = 1;
        int b = 2;
        int c = 3;

//        Перечень операций:
        int d = a++ + b++ + c++;    //  6    2 3 4
        int e = a-- + b-- + c--;    //  9    1 2 3
        int f = --a + ++b + c--;    //  6    0 3 2
        int g = ++a + --b + --c;    //  4    1 2 1
        int h = d++ + ++e + ++f + g--;// 27  7 10 7 3
        int i = --d + --e + --f + --g;// 23  6 9 6 2
        int j = h++ + ++i;            // 51  28 24


        double time1 = System.currentTimeMillis();
        long k = 0;
        for (; k < 2000000000L;)
        {
            a++;
            k++;
        }
        System.out.println(System.currentTimeMillis() - time1);

        time1 = System.currentTimeMillis();
        k = 0;
        while (k < 2000000000L)
        {
            a++;
            k++;
        }

        System.out.println(System.currentTimeMillis() - time1);



        Enter:
        for (int r = 0; r < 3; r++)
        {
            for (int t = 0; t < 3; t++)
            {
                if (t == 1)
                    break Enter;
                System.out.println("r: " + r + ",t: " + t );
            }
        }
        System.out.println("Цикл завершён");

    }
}
