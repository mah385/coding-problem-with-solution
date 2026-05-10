package strings;

import java.util.ArrayList;

//Question: WAP to reverse each word in a given string
public class ReverseEachWordInAString {

    static void main(String[] args) {
        System.out.println("reverseEachWordInAString: " + reverseEachWordInAString("The Brown Fox Jumps Over The Lazy Dog"));
    }

    public static String reverseEachWordInAString(String str) {
        if (str != null && !str.isBlank()) {
            String[] stringArray = str.split(" ");

            ArrayList<String> stringArrayList = new ArrayList<>();

            for (int i = stringArray.length - 1; i >= 0; i--) {
                stringArrayList.add(stringArray[i]);
            }

            return String.join(" ", stringArrayList);
        }
        return null;
    }

}
