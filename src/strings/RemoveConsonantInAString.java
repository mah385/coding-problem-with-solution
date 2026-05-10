package strings;

//Question: WAP to remove consonants in a given string.
public class RemoveConsonantInAString {

    static void main(String[] args) {
        System.out.println("removeConsonantInAString: " + removeConsonantInAString("the brOwn fox jumps over the lAzy dog."));
    }

    private static String removeConsonantInAString(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "");
    }

}
