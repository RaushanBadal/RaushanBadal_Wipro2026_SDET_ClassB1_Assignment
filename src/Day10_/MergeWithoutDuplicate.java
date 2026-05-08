package Day10_;
import java.util.*;

public class MergeWithoutDuplicate {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Sagnik", "Arpan", "Rahul"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Arpan", "Aman", "Rahul"));

        ArrayList<String> result = new ArrayList<>();

       
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

        System.out.println("Merged without duplicates: " + result);
    }
}
