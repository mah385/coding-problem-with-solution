package number;

import java.util.Arrays;
import java.util.stream.Collectors;

//Question: WAP to remove duplicate digits from a given number
public class RemoveDuplicateNumber {

    static void main(String[] args) {
        long number = 669_412_537_612L;
        System.out.println("removeDuplicateNumber(number): " + removeDuplicateNumber(number));
    }

    private static long removeDuplicateNumber(long number) {
        String numberInStringForm = Arrays.stream(String.valueOf(number).split(""))
                .distinct()
                .collect(Collectors.joining());
        return Long.parseLong(numberInStringForm);
    }

}
