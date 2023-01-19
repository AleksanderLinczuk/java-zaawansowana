package optionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercise {

    public static void main(String[] args) {
        String[] tab = new String[]{"Tomek", null, "Jan", null, "Maria", "Julia", "Robert"};
        List<String> stringList = new ArrayList<>(Arrays.asList(tab));

        Integer[] integers = {1, 2, 3213, 33, 756,6,77};

        stringList.forEach(s -> findNull(s));
    }

    private static <T> void findNull(T s){
        var optional = Optional.ofNullable(s);
        if (!optional.isPresent())
            System.out.println("Znalazlem nulla");
    }
    private static void check(String s){
        var optional = Optional.ofNullable(s);
        if (!optional.isPresent())
            System.out.println(optional.get());

    }
}
