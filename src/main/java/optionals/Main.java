package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        String empty = null;
        Optional<String> stringOptional = Optional.ofNullable(empty);

        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get());
        }

        String name = "Tomek";
        Optional<String> nameOptional = Optional.ofNullable(name);
        var name1 = nameOptional.orElse("Kamil");
        System.out.println(name1);


        var name3 = nameOptional.orElseGet(() -> "Kamil");
        System.out.println(name3);

        stringOptional.orElseThrow(()-> new RuntimeException("W optionalu nic nie było ziom"));

    }
}
