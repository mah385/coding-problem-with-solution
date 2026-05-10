package strings;

import java.util.HashSet;

//Question: WAP to check whether a given string contains only unique characters
public class UniqueCharacterInAString {

    public static void main(String[] args) {
        System.out.println("checkForUniqueCharacterInAString(Hello): " + checkForUniqueCharacterInAString("Hello"));
        System.out.println("checkForUniqueCharacterInAString(World): " + checkForUniqueCharacterInAString("World"));
    }

    private static Boolean checkForUniqueCharacterInAString(String string) {
        if (string != null && !string.isBlank()) {
            HashSet<Character> characterHashSet = new HashSet<>();
            for (char ch : string.toLowerCase().toCharArray()) { //Note: usage of toLowerCase method can be a counter question
                if (!characterHashSet.add(ch)) {
                    return false;
                }
            }
            return true;
        }
        return null;
    }

}
