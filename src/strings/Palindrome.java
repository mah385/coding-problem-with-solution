package strings;

//Question: WAP to check whether a given string is Palindrome
public class Palindrome {

    public static void main(String[] args) {
        System.out.println("checkForPalindromeApproach1: " + checkForPalindromeApproach1("malayalam"));
        System.out.println("checkForPalindromeApproach2: " + checkForPalindromeApproach2("madam"));
    }

    private static Boolean checkForPalindromeApproach1(String string) {
        if (string != null && !string.isBlank()) {
            char[] charArray = string.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = (charArray.length - 1); i >= 0; i--) {
                stringBuilder.append(charArray[i]);
            }
            return string.contentEquals(stringBuilder);
        }
        return null;
    }

    private static Boolean checkForPalindromeApproach2(String string) {
        if (string != null && !string.isBlank()) {
            return string.contentEquals(new StringBuilder(string).reverse());
        }
        return null;
    }

}
