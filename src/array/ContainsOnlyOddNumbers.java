package array;

import java.util.Arrays;

//Question: WAP to check whether the given integer array contains only odd numbers
public class ContainsOnlyOddNumbers {

    public static void main(String[] args) {
        int[] integerArray1 = {17, 65, 43, 27, 5, 41};      //contains only odd numbers
        int[] integerArray2 = {17, 65, 18, 43, 27, 5, 41};  //contains both odd and even numbers

        System.out.println("integerArrayContainsOnlyOddNumbersApproach1(integerArray1): " + integerArrayContainsOnlyOddNumbersApproach1(integerArray1));
        System.out.println("integerArrayContainsOnlyOddNumbersApproach1(integerArray2): " + integerArrayContainsOnlyOddNumbersApproach1(integerArray2));
        System.out.println("------------------------------------------------------");
        System.out.println("integerArrayContainsOnlyOddNumbersApproach2(integerArray1): " + integerArrayContainsOnlyOddNumbersApproach2(integerArray1));
        System.out.println("integerArrayContainsOnlyOddNumbersApproach2(integerArray2): " + integerArrayContainsOnlyOddNumbersApproach2(integerArray2));
    }

    private static boolean integerArrayContainsOnlyOddNumbersApproach1(int[] integerArray) {
        for (int integer : integerArray) {
            if (integer % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean integerArrayContainsOnlyOddNumbersApproach2(int[] integerArray) {
        return Arrays.stream(integerArray).allMatch(value -> value % 2 == 1);
    }

}
