package strings;

//Question: WAP to remove all blank spaces in a given string
public class RemoveAllBlankSpaceInAString {

    public static void main(String[] args) {
        System.out.println("removeAllBlankSpaceInAStringApproach1: " + removeAllBlankSpaceInAStringApproach1("the brown fox jumps over the lazy dog"));
        System.out.println("removeAllBlankSpaceInAStringApproach2: " + removeAllBlankSpaceInAStringApproach2("the brown fox jumps over the lazy dog"));
    }

    private static String removeAllBlankSpaceInAStringApproach1(String string) {
        if (string != null && !string.isBlank()) {
            StringBuilder result = new StringBuilder();
            for (char ch : string.toCharArray()) {
                if (ch != ' ') {
                    result.append(ch);
                }
            }
            return result.toString();
        }
        return null;
    }

    private static String removeAllBlankSpaceInAStringApproach2(String string) {
        if (string != null && !string.isBlank()) {
            return string.replaceAll(" ", "");
        }
        return null;
    }

}
