package strings;

//Question: WAP to count frequency of each word in a given string
public class CountGivenCharacterFrequencyInAString {

    public static void main(String[] args) {
        System.out.println("countGivenCharacterFrequencyInAString: " + countGivenCharacterFrequencyInAString("this is a test value", 's'));
    }

    private static Integer countGivenCharacterFrequencyInAString(String string, char givenCharacter) {
        if (string != null && !string.isBlank()) {
            int count = 0;
            for (char ch : string.toCharArray()) {
                if (givenCharacter == ch) {
                    count++;
                }
            }
            return count;
        }
        return null;
    }

}
