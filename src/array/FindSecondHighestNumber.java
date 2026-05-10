package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

//Question: WAP to find the second-highest number in the given integer array
//Note: Other approaches are not shown
public class FindSecondHighestNumber {

    static void main(String[] args) {
        int[] integerArray = {2, 6, 3, 1, 8, 5, 4, 9, 8, 7, 2, 8, 5};
        System.out.println("findSecondHighestNumberInAnIntegerArray: " + findSecondHighestNumberInAnIntegerArray(integerArray));
    }

    private static Integer findSecondHighestNumberInAnIntegerArray(int[] integerArray) {
        if (integerArray != null && integerArray.length >= 2) {
            Optional<Integer> optionalSecondHighestNumber = Arrays.stream(integerArray)
                    .boxed()
                    .distinct()
                    .sorted(Comparator.reverseOrder())
                    .skip(1)
                    .limit(1)
                    .findFirst();
            if (optionalSecondHighestNumber.isPresent()) {
                return optionalSecondHighestNumber.get();
            }
        }
        return null;
    }

}
