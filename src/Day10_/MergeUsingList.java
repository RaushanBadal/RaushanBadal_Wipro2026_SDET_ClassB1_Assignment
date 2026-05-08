package Day10_;

import java.util.*;

public class MergeUsingList {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(Arrays.asList("Sagnik", "Arpan", "Rahul"));
        List<String> list2 = new LinkedList<>(Arrays.asList("Arpan", "Aman", "Rahul"));

        List<String> result = new ArrayList<>();

        for (String s : list1) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }

        for (String s : list2) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }

        System.out.println("Merged List (No Duplicates): " + result);
    }
}
