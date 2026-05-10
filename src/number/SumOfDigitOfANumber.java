package number;

import java.util.Arrays;

//Question: WAP to calculate the sum of digits of the given number
public class SumOfDigitOfANumber {

    static void main(String[] args) {
        System.out.println("calculateSumOfDigitOfANumber: " + calculateSumOfDigitOfANumber(657864));
    }

    private static int calculateSumOfDigitOfANumber(int number) {
        return Arrays.stream(String.valueOf(number).split(""))
                .map(s -> Integer.valueOf(s))
                .mapToInt(value -> value)
                .sum();
    }

}
