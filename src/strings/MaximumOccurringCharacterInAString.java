package strings;

import java.util.LinkedHashMap;
import java.util.Map;

//Question: WAP to find and print maximum occurring character in a string
public class MaximumOccurringCharacterInAString {

    public static void main(String[] args) {
        findAndPrintMaximumOccurringCharacterInAString("the brown fox jumps over a lazy dog");
    }

    private static void findAndPrintMaximumOccurringCharacterInAString(String str) {
        Map<Character, Integer> characterIntegerHashMap = new LinkedHashMap<>();
        for (char ch : str.replace(" ", "").toCharArray()) {
            characterIntegerHashMap.put(ch, characterIntegerHashMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println("characterIntegerHashMap: " + characterIntegerHashMap);
        characterIntegerHashMap
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println("Character: " + e.getKey() + " Count: " + e.getValue()));
    }

}
