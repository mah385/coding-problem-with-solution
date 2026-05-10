package strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Question: WAP to count frequency of each word in a given string
public class CountFrequencyOfEachWordInAString {

    static void main(String[] args) {
        System.out.println("countFrequencyOfEachWordInAString: " + countFrequencyOfEachWordInAString("this is a test string this is a test"));
    }

    private static Map<String, Long> countFrequencyOfEachWordInAString(String string) {
        return Arrays.stream(string.split(" "))
                //.collect(Collectors.groupingBy(s -> s, Collectors.counting())); //Note: can be used interchangeable
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

}
