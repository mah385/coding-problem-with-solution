package strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Question: WAP to find distinct characters and their count in a string
public class DistinctCharacterAndTheirCountInAString {

    public static void main(String[] args) {
        String str = "this is test hello world";
        System.out.println("findDistinctCharacterAndTheirCountInAStringApproach1: " + findDistinctCharacterAndTheirCountInAStringApproach1(str));
        System.out.println("findDistinctCharacterAndTheirCountInAStringApproach2: " + findDistinctCharacterAndTheirCountInAStringApproach2(str));
    }

    private static Map<Character, Integer> findDistinctCharacterAndTheirCountInAStringApproach1(String str) {
//        Map<Character, Integer> characterIntegerHashMap = new HashMap<>();
        Map<Character, Integer> characterIntegerHashMap = new LinkedHashMap<>(); //use LinkedHashMap and observe the result
        for (char ch : str.replaceAll(" ", "").toCharArray()) {
            characterIntegerHashMap.put(ch, characterIntegerHashMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println(characterIntegerHashMap);
        characterIntegerHashMap.entrySet().removeIf(characterIntegerEntry -> characterIntegerEntry.getValue() > 1);
        return characterIntegerHashMap;
    }

    private static Map<String, Long> findDistinctCharacterAndTheirCountInAStringApproach2(String str) {
        return Arrays.stream(str.replaceAll(" ", "").split(""))
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

}
