package number;

//Question: WAP to calculate the factorial of the given number
public class FactorialNumber {

    public static void main(String[] args) {
        System.out.println("calculateFactorial: " + calculateFactorial(5));
    }

    private static int calculateFactorial(int number) {
        if (number <= 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        int result = 1;
        for (int i = number; i >= 2; i--) {
            result *= i;
        }
        return result;
    }

}
