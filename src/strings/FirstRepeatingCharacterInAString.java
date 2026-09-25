package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Question: WAP to find first repeating character in a string
public class FirstRepeatingCharacterInAString {

    static void main(String[] args) {
        String str = "this is test hello world";
        System.out.println("findFirstRepeatingCharacterInAStringApproach1: " + findFirstRepeatingCharacterInAStringApproach1(str));
        System.out.println("findFirstRepeatingCharacterInAStringApproach2: " + findFirstRepeatingCharacterInAStringApproach2(str));
    }

    private static Character findFirstRepeatingCharacterInAStringApproach1(String str) {
        Map<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (char ch : str.replaceAll("\\s+", "").toCharArray()) { //use .toLowerCase() method to make it case-insensitive
            characterIntegerHashMap.put(ch, characterIntegerHashMap.getOrDefault(ch, 0) + 1);
            if (characterIntegerHashMap.get(ch) > 1) {
                return ch;
            }
        }
        return null;
    }

    private static Character findFirstRepeatingCharacterInAStringApproach2(String str) {
        Set<Character> seen = new HashSet<>();
        for (char ch : str.replaceAll("\\s+", "").toLowerCase().toCharArray()) {
            if (!seen.add(ch)) {
                return ch;
            }
        }
        return null;
    }

}
