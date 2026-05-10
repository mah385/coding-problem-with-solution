package array;

import java.util.Arrays;

//Question: WAP to calculate the total sum of the given integer array
public class CalculateTotalSum {

    public static void main(String[] args) {
        int[] integerArray = {6, 3, 5, 4, 3, 2, 4, 5};
        System.out.println("calculateTotalSumOfAnIntegerArrayApproach1: " + calculateTotalSumOfAnIntegerArrayApproach1(integerArray));
        System.out.println("calculateTotalSumOfAnIntegerArrayApproach2: " + calculateTotalSumOfAnIntegerArrayApproach2(integerArray));
    }

    private static int calculateTotalSumOfAnIntegerArrayApproach1(int[] integerArray) {
        int totalSum = 0;
        for (int integer : integerArray) {
            totalSum += integer;
        }
        return totalSum;
    }

    private static int calculateTotalSumOfAnIntegerArrayApproach2(int[] integerArray) {
        /*return Arrays.stream(integerArray)
                .boxed()
                .collect(Collectors.summingInt(value -> value));*/
        return Arrays.stream(integerArray)
                .boxed()
                .mapToInt(value -> value)
                .sum();
    }

}
