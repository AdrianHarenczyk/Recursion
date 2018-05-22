public class Main {

    public static void main(String[] args) {
        Main application = new Main();
        System.out.println(application.factorial(5));
        System.out.println(application.fibonacci(8));
    }


    private int factorial(int n) {
        if (n < 0)
            return -1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    private int fibonacci(int n) {
        if (n < 0)
            return -1;
        else if (n == 0)
            return 0;
        else if (n == 1 || n == 2)
            return 1;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

}
