package strings;

//Question: WAP to check whether a given string contains vowel letters
public class VowelCharacterInAString {

    static void main(String[] args) {
        System.out.println("checkForVowelCharacterInAStringApproach1: " + checkForVowelCharacterInAStringApproach1("Hello World"));
        System.out.println("checkForVowelCharacterInAStringApproach2: " + checkForVowelCharacterInAStringApproach2("Hello World"));
    }

    public static Boolean checkForVowelCharacterInAStringApproach1(String string) {
        if (string != null && !string.isBlank()) {
            for (char ch : string.toCharArray()) {
                if ("aeiouAEIOU".contains(String.valueOf(ch))) {
                    return true;
                }
            }
            return false;
        }
        return null;
    }

    public static Boolean checkForVowelCharacterInAStringApproach2(String string) {
        if (string != null && !string.isBlank()) {
            return string.matches(".*[aeiouAEIOU].*");
        }
        return null;
    }

}
