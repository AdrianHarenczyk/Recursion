import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Main application = new Main();
        System.out.println(application.endX("xxre"));
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

    private int count7(int n) {
        if (n == 0)
            return 0;
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        }
        return count7(n / 10);
    }

    public int bunnyEars(int bunnies) {
        if (bunnies <= 0)
            return 0;
        if (bunnies == 1)
            return 2;
        else
            return bunnyEars2(bunnies - 1) + 2;
    }

    private int count8(int n) {
        if (n == 0)
            return 0;
        if (n % 10 == 8 && ((n / 10) % 10) == 8) {
            return 2 + count8(n / 10);
        }
        if (n % 10 == 8) {
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }

    private int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        }
        return base * powerN(base, n - 1);
    }

    private int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.substring(str.length() - 1).equals("x")) {
            return 1 + countX(str.substring(0, str.length() - 1));
        }
        return countX(str.substring(0, str.length() - 1));
    }

    private int countHi(String str) {
        if (str == null || str.length() < 2)
            return 0;
        if (str.substring(str.length() - 2, str.length()).equals("hi")) {
            return 1 + countHi(str.substring(0, str.length() - 2));
        }
        return countHi(str.substring(0, str.length() - 1));
    }
    private String changeXY(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        if (!str.contains("x")) {
            return str;
        }
        return changeXY(str.replaceFirst("x","y"));
    }
    private String changePi(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        if (!str.contains("pi")) {
            return str;
        }
        return changePi(str.replaceFirst("pi","3.14"));
    }
    private String noX(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        if (!str.contains("x")) {
            return str;
        }
        return noX(str.replaceFirst("x",""));
    }
    private boolean array6(int[] nums, int index) {
        if (nums == null || nums.length == 0 || index >= nums.length)
            return false;
        if (nums[index] == 6)
            return true;
        return array6(nums,index+1);
    }
    private int array11(int[] nums, int index) {
        if (nums == null || nums.length == 0)
            return 0;
        if (index == nums.length -1 && nums[index] == 11)
            return 1;
        if (index == nums.length -1 && nums[index] != 11)
            return 0;
        if (index < nums.length && nums[index] == 11)
            return 1 + array11(nums,index+1);
        return array11(nums,index+1);
    }
    private boolean array220(int[] nums, int index) {
        if (nums == null || nums.length == 0 || index+1 >= nums.length)
            return false;
        if (nums[index] * 10 == nums[index+1])
            return true;
        return array220(nums,index+1);
    }
    private String allStar(String str) {
        if (str == null || str.isEmpty())
            return "";
        if (str.length() == 1)
            return str;
        return str.charAt(0)+"*"+allStar(str.substring(1));
    }
    private String pairStar(String str) {
        if (str == null || str.isEmpty())
            return "";
        if (str.length() == 1)
            return str;
        if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0)+"*"+pairStar(str.substring(1));
        }
        return str.charAt(0) + pairStar(str.substring(1));
    }
    private String endX(String str) {
        if (str == null || str.isEmpty())
            return "";
        if (str.length() == 1)
            return str;
        if (str.charAt(0) == 'x') {
            return endX(str.substring(1))+str.charAt(0);
        }
        return str.charAt(0) + endX(str.substring(1));
    }
    private int countPairs(String str) {
        if (str == null || str.isEmpty() || str.length() < 3)
            return 0;
        if (str.charAt(0) == str.charAt(2)) {
            return 1 + countPairs(str.substring(1));
        }
        return countPairs(str.substring(1));
    }

}
