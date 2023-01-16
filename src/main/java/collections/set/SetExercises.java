package collections.set;

import java.util.*;

public class SetExercises {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Tomek");
        stringList.add("Janina");
        stringList.add("Janina");
        stringList.add("Barbara");
        stringList.add("Barbara");

        System.out.println(stringList);
        removeDuplicates(stringList);

        System.out.println(stringList);

    }
    private static void removeDuplicates(List<String> list){
        LinkedHashSet<String> newList = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(newList);

    }
}
