package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

//Question: WAP to capitalize each word of the given string
public class CapitalizeEachWordInAString {

    static void main(String[] args) {
        System.out.println("capitalizeEachWordInAString: " + capitalizeEachWordInAString("the brOWn fox JumPS over the lAZy Dog."));
        //Output: The Brown Fox Jumps Over The Lazy Dog.
    }

    private static String capitalizeEachWordInAString(String string) {
        if (string != null && !string.isBlank()) {
            return Arrays.stream(string.split(" "))
                    //.parallel() //Note: use parallel processing only when data is huge
                    .map(s -> s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase()))
                    .collect(Collectors.joining(" "));
        }
        return null;
    }

}
