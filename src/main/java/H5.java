import static java.lang.Math.max;

public class H5 {

    private static int a, b, c, d, e;
    private static String x, y;
    private static int greatest;


    public static void main(String[] args) {
        //greatest(8,5);
        //greatest("Yolo", "Swaggings");
        //greatest(10,203,4032,32,300,432);
        //factorial(5, 1);
        //faculty(5);
        //facultyRec(5);
        Fibo.run(5);
        Fibo.run(1, 5);
        Fibo.run(5,4,5);
    }

    public static int greatest(int a, int b) {
        greatest = max(a, b);
        System.out.println(greatest);
        return greatest;
    }

    public static int greatest(String x, String y) {
        greatest = max(x.length(), y.length());
        System.out.println(greatest);
        return greatest;
    }

    public static int greatest(int... numbers) {
        int greatest = numbers[0];   // start with the first value
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];   // new maximum
            }
        }
        System.out.println(greatest);
        return greatest;
    }

    private static void factorial(int n, int result) {
        if (n != 0) {
            result = result * (n);
            n--;
            factorial(n, result);
        } else {
            System.out.println(result);
        }
    }

//    private static void faculty(int n) {
//        long result = 1;
//        for (int i = n; i >= 1; i--) {
//            result = result*i;
//            System.out.println(result);
//        }
//    }


//    public static int facultyRec(int n) {
//        if (n == 1) return 1;
//        return n * facultyRec(n - 1);
//
//    }
}


