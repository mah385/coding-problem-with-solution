package strings;

//Question: WAP to remove vowels in a given string.
public class RemoveVowelInAString {

    static void main(String[] args) {
        System.out.println("removeVowelInAString: " + removeVowelInAString("the brOwn fox jumps over the lAzy dog."));
    }

    private static String removeVowelInAString(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

}
