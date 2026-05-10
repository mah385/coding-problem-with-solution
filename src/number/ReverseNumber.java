package number;

//Question: WAP to reverse a given number
public class ReverseNumber {

    public static void main(String[] args) {
        int  number = 12345; // Example number
        System.out.println("reverseNumberUsingApproach1(number): " + reverseNumberUsingApproach1(number));
        System.out.println("reverseNumberUsingApproach2(number): " + reverseNumberUsingApproach2(number));
    }

    private static int reverseNumberUsingApproach1(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        return reversed;
    }

    private static int reverseNumberUsingApproach2(int number) {
        String reversedStr = new StringBuilder(String.valueOf(number)).reverse().toString();
        return Integer.parseInt(reversedStr);
    }

}
