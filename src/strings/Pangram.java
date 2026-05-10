package strings;

//Question: WAP A pangram is a sentence that contains every letter of the alphabet at least once.
public class Pangram {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(sentence);
        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    private static boolean checkPangram(String sentence) {
        sentence = sentence.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

}
