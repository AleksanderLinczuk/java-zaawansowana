package collections.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercises {
    public static void main(String[] args) {
        Person jan = new Person("Jan", "Kowalski");
        Person karolina = new Person("Karolina", "Szwata");
        Person rozalia = new Person("Rozalia", "Kobylska");
        Person maciej = new Person("Maciej", "Puszkowski");
        Person tomasz = new Person("Tomasz", "Wojtyra");

        List<Person> people = List.of(jan, rozalia, karolina, tomasz,maciej);

        // stwórz nową listę imion, w której nie będzie osób z nazwiskiem na literę K oraz zwrócone zostanie tylko imie

        var peopleStream = people.stream();
        var onlyNamesNoKSurname = peopleStream.filter(string -> (!string.getSurname().startsWith("K"))).map(string -> string.getName()).toList();

//        var reversedNamesAndSurnames = peopleStream.map(peopleStream -> s.setName(s.getSurname())).toList();
        System.out.println(onlyNamesNoKSurname);
//        System.out.println(reversedNamesAndSurnames);




        //Jan
        String jan1 = "Jan";
        Integer matemematyka1 = 1;
        Integer biologia1 = 5;
        List<Integer> ocenyJan = List.of(matemematyka1, biologia1);
        //Basia
        String basia = "Basia";
        Integer matemematyka2 = 4;
        Integer biologia2 = 4;

        //klasa
        List<Integer> ocenyBasia = List.of(matemematyka2, biologia2);
        Map<String, List<Integer>> classroom = new HashMap<>();
        classroom.put(jan1, ocenyJan);
        classroom.put(basia, ocenyBasia);




    }
}
