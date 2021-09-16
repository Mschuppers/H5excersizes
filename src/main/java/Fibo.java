public class Fibo {


    public static void run(int n){
        int n1=1,n2=1,n3;
        printFirstDigits(n1,n2);
        for (int i = 1; i < n; i++) {
            n3 = n1 +n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println("=======");
    }

    public static void run(int start, int n){
        int n1 = start;
        int n2 = n1;
        printFirstDigits(n1,n2);
        for (int i = 1; i < n; i++) { //start at 1 because we already printed iteration 0 on screen
            int n3 = n1 +n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }System.out.println("=======");
    }

    public static void run(int n, int n1, int n2){
    printFirstDigits(n1,n2);
        for (int i = 1; i < n; i++) { //start at 1 because we already printed iteration 0 on screen
            int n3 = n1 +n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }System.out.println("=======");
    }

    private static void printFirstDigits(int n1, int n2) {
        System.out.println(n1);
        System.out.println(n2);
    }

}
