package number;

//Question: WAP to check whether a given number is Prime number
public class PrimeNumber {

    static void main(String[] args) {
        System.out.println("checkForPrimeNumber: " + checkForPrimeNumber(3));
    }

    private static boolean checkForPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
