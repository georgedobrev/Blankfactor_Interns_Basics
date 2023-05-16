import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class Family {
    String name;
    int age;
    List<Person> family = new ArrayList<>();

    public void family(String name, int age, List<Person>family){
        this.name = name;
        this.age = age;
        this.family = family;
    }

    public Person GetOldestMember() {
        return family.stream().max(Comparator.comparingInt((ToIntFunction<? super Person>) Person::getAge)).get();
    }
}
