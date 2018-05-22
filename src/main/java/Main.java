public class Main {

    public static void main(String[] args) {
        Main application = new Main();
        System.out.println(application.factorial(5));
        System.out.println(application.fibonacci(8));
        System.out.println();
    }


    private int factorial(int n) {
        if (n < 0)
            return -1;
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
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
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private int bunnyEars2(int bunnies) {
        if (bunnies <= 0)
            return 0;
        if (bunnies == 1)
            return 2;
        if (bunnies % 2 == 0)
            return bunnyEars2(bunnies - 1) + 3;
        else
            return bunnyEars2(bunnies - 1) + 2;
    }

    private int triangle(int rows) {
        if (rows <= 0)
            return 0;
        else
            return triangle(rows - 1) + rows;
    }

    private int sumDigits(int n) {
        if (n / 10 == 0) {
            return n;
        } else {
            return (n % 10) + sumDigits(n / 10);
        }
    }

}
