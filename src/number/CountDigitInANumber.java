package number;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//Question: WAP to count digits, unique digits and duplicate digits in a given number
public class CountDigitInANumber {

    public static void main(String[] args) {
        long number = 669_412_537_612L;
        System.out.println("countDigitInANumber: "+countDigitInANumber(number));
        System.out.println("countUniqueDigitInANumber: "+countUniqueDigitInANumber(number));
        System.out.println("countDuplicateDigitInANumber: "+ countDuplicateDigitInANumber(number));
    }

    private static int countDigitInANumber(long number) {
        return String.valueOf(number).length();
    }

    private static int countUniqueDigitInANumber(long number) {
        Map<String, Long> digitAndCountMap = Arrays.stream(String.valueOf(number).split(""))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        int count = 0;
        for (Map.Entry<String, Long> stringLongEntry : digitAndCountMap.entrySet()) {
            if (stringLongEntry.getValue() == 1) {
                count++;
            }
        }
        return count;
    }

    private static int countDuplicateDigitInANumber(long number) {
        Map<String, Long> digitAndCountMap = Arrays.stream(String.valueOf(number).split(""))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        int count = 0;
        for (Map.Entry<String, Long> stringLongEntry : digitAndCountMap.entrySet()) {
            if (stringLongEntry.getValue() > 1) {
                count++;
            }
        }
        return count;
    }

}
