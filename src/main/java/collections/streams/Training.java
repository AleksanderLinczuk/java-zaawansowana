package collections.streams;

import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Training {

    private String name;
    private List<Person> students;
}
