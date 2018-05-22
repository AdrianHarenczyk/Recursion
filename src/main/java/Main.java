public class Main {

    public static void main(String[] args) {
        Main application = new Main();
        System.out.println(application.factorial(5));
    }


    private int factorial(int n) {
        if (n < 0)
            return -1;
        if (n == 0 || n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return n * factorial(n-1);
        }
    }
}
