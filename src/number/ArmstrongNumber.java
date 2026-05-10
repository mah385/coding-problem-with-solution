package number;

import java.util.Arrays;

//Question: WAP to check whether a given number is Armstrong number
public class ArmstrongNumber {

    public static void main(String[] args) {
        for (int i = 10; i < 10000; i++) { //Note: for loop is not required
            System.out.println("i: " + i + " ---> " + checkForArmstrongNumber(i));
        }
    }

    private static boolean checkForArmstrongNumber(int number) {
        int noOfDigit = String.valueOf(number).length();
        return number == Arrays.stream(String.valueOf(number).split(""))
                .map(s -> (int) Math.pow(Integer.parseInt(s), noOfDigit))
                .mapToInt(value -> value)
                .sum();
    }

}
