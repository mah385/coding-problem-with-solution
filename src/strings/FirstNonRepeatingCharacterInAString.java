package strings;

import java.util.LinkedHashMap;
import java.util.Map;

//Question: WAP to find first non-repeating character in a string
public class FirstNonRepeatingCharacterInAString {

    static void main(String[] args) {
        String str = "this is test hello world";
        System.out.println("findFirstNonRepeatingCharacterInAString: " + findFirstNonRepeatingCharacterInAString(str));
    }

    private static Character findFirstNonRepeatingCharacterInAString(String str) {
//        Map<Character, Integer> characterIntegerHashMap = new HashMap<>(); //use HashMap and observe the result
        Map<Character, Integer> characterIntegerHashMap = new LinkedHashMap<>();
        for (char ch : str.replace(" ", "").toCharArray()) {
            characterIntegerHashMap.put(ch, characterIntegerHashMap.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : characterIntegerHashMap.entrySet()) {
            if (characterIntegerEntry.getValue() == 1) {
                return characterIntegerEntry.getKey();
            }
        }
        return null;
    }

}
