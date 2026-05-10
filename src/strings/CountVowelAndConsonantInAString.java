package strings;

//Question: WAP to count the number of vowels and consonants in a string.
public class CountVowelAndConsonantInAString {

    static void main(String[] args) {
        countVowelAndConsonant("87_ Hello World 234&*%&^$]{[}^%(*%6213576");
    }

    private static void countVowelAndConsonant(String str) {
        if (str != null && !str.isBlank()) {
            int countVowel = 0;
            int countConsonant = 0;
            for (char ch : str.replaceAll("[^a-zA-Z]", "").toCharArray()) {
                if ("aeiouAEIOU".contains(String.valueOf(ch))) {
                    countVowel++;
                } else {
                    countConsonant++;
                }
            }
            System.out.println("countVowel: " + countVowel);
            System.out.println("countConsonant: " + countConsonant);
        }
    }

}
