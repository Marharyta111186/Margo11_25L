package Lesson_40.HW;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HW_40 {
    public static List<String> removeDuplicates(List<String> names) {
        Set<String> uniqueNames = new HashSet<>(names);
        List<String> result = new ArrayList<>(uniqueNames);

        return result;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Bill");
        names.add("John");
        names.add("Ann");
        names.add("Bill");

        List<String> uniqueNames = removeDuplicates(names);
        System.out.println(uniqueNames);

    }
}



