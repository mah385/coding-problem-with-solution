package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Question: WAP to perform various collection operations using two given integer arrays
public class VariousCollectionOperationUsingTwoArray {

    public static void main(String[] args) {
        int[] arr1 = {17, 5, 27, 23, 87, 47, 28, 3};
        int[] arr2 = {17, 65, 18, 43, 27, 5, 41};


        new ArrayList<>(Collections.singleton(arr1));
        List<Integer> arr1List = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> arr2List = Arrays.stream(arr2).boxed().collect(Collectors.toList());

        arr1List.removeAll(arr2List);

    }
}
