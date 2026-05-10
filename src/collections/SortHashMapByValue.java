package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Question: WAP to sort hash map by value
public class SortHashMapByValue {

    static void main(String[] args) {
        Map<String, Integer> scores = new LinkedHashMap<>();

        scores.put("Ravid", 95);
        scores.put("Jane", 80);
        scores.put("Mary", 97);
        scores.put("Zino", 65);
        scores.put("Lisa", 78);

        System.out.println("scores: " + scores);

        Map<String, Integer> scoresSorted = scores.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (integer, integer2) -> integer2, LinkedHashMap::new
                        )
                );

        System.out.println("scoresSorted: " + scoresSorted);
    }

}
