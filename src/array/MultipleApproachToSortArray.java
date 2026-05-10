package array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Question: WAP to sort a given array using multiple approaches
public class MultipleApproachToSortArray {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(56, 4, 1, 63, 8, 74, 23, 6, 2, 45, 63, 1, 4);
        System.out.println(integerList.stream().sorted().toList());

        int[] arr1 = {56, 4, 1, 63, 8, 74, 23, 6, 2, 45, 63, 1, 4};
        Arrays.sort(arr1); //original array is modified
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {56, 4, 1, 63, 8, 74, 23, 6, 2, 45, 63, 1, 4};
        System.out.println(Arrays.toString(Arrays.stream(arr2).sorted().toArray()));

        int[] arr3 = {56, 4, 1, 63, 8, 74, 23, 6, 2, 45, 63, 1, 4};
        System.out.println(Arrays.stream(arr3).boxed().sorted().collect(Collectors.toList()));
    }

}
