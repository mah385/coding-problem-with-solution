package array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

//Question: WAP to find the missing number in the given series
public class MissingNumberInASeries {

    static void main(String[] args) {
        int[] integerArray = {6, 3, 5, 4, 3, 2, 8, 4, 5, 1, 9};
        int missingNumberInASeries = findMissingNumberInASeries(integerArray);
        System.out.println("missingNumberInASeries: " + missingNumberInASeries);
    }

    private static int findMissingNumberInASeries(int[] integerArray) {
        LinkedHashSet<Integer> uniqueIntegerNumberSet = Arrays.stream(integerArray)
                .boxed()
                .sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println("uniqueIntegerNumberSet: " + uniqueIntegerNumberSet);

        int totalSumWithoutMissingNumber = uniqueIntegerNumberSet.stream().mapToInt(Integer::intValue).sum();

        System.out.println("totalSumWithoutMissingNumber: " + totalSumWithoutMissingNumber);

        Integer first = uniqueIntegerNumberSet.getFirst();
        Integer last = uniqueIntegerNumberSet.getLast();

        int totalSumWithMissingNumber = 0;
        for (int i = first; i <= last; i++) {
            totalSumWithMissingNumber += i;
        }
        System.out.println("totalSumWithMissingNumber: " + totalSumWithMissingNumber);

        return totalSumWithMissingNumber - totalSumWithoutMissingNumber;
    }

}
