package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

//Question: WAP to remove duplicate word in a given string.
public class RemoveDuplicateWordInAString {

    static void main(String[] args) {
        System.out.println("removeDuplicateWordInAString: " + removeDuplicateWordInAString("Hello World! This is a test string with duplicate words. Hello World!"));
    }

    private static String removeDuplicateWordInAString(String str) {
        return Arrays.stream(str.split(" "))
                .distinct()
                .collect(Collectors.joining(" "));
    }

}
