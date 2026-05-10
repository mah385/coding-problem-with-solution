package array;

import java.util.Arrays;
import java.util.LinkedList;

//Question: WAP to reverse the given integer array using LinkedList
public class ReverseUsingLinkedList {

    public static void main(String[] args) {
        int[] integerArray = {5, 3, 2, 8, 4, 7, 6, 1};
        System.out.println("Before reversing: " + Arrays.toString(integerArray));
        System.out.println("After reversing: " + reverseIntegerArrayUsingLinkedList(integerArray));
    }

    private static LinkedList<Integer> reverseIntegerArrayUsingLinkedList(int[] integerArray) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>(Arrays.stream(integerArray).boxed().toList());

        LinkedList<Integer> reverseIntegerLinkedList = new LinkedList<>();
        integerLinkedList
                .descendingIterator()
                .forEachRemaining(integer -> reverseIntegerLinkedList.add(integer));
        return reverseIntegerLinkedList;
    }

}
