package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

//Question: WAP to check whether given two strings are Anagram
public class Anagram {

    static void main(String[] args) {
        System.out.println("checkForAnagram(listen, silent): " + checkForAnagram("listen", "silent"));
        System.out.println("checkForAnagram(hello, world): " + checkForAnagram("hello", "world"));
    }

    public static Boolean checkForAnagram(String string1, String string2) {
        if (string1 != null && string2 != null && !string1.isBlank() && !string2.isBlank()) {
            String sortedString1 = Arrays.stream(string1.split("")).sorted().collect(Collectors.joining());
            String sortedString2 = Arrays.stream(string2.split("")).sorted().collect(Collectors.joining());
            return sortedString1.equals(sortedString2);
        }
        return null;
    }

}
