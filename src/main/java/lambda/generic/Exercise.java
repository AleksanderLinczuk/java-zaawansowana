package lambda.generic;

import java.util.List;
import java.util.function.Consumer;

public class Exercise {
    public static void main(String[] args) {
        String s = "Imie";
//        System.out.println(s);
        Integer i = 777;
        Character c = 'z';

        process(s, o -> System.out.println(s));

        process(i, e ->System.out.println(i));

        process(c, f -> System.out.println(c));
    }

    private static <E> void process(E object, Consumer<E> consumer){
        consumer.accept(object);
    }
}
