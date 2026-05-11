import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//
       List<Person> people=getPeople();

//
//        List<Person> femaleList =new ArrayList<>();
//
//        for (Person person: people ){ <- This approach was before Stream API
//            if (person.getGender().equals(Gender.FEMALE)){
//                femaleList.add(person);
//            }
//        }
//
//        femaleList.forEach((person -> System.out.println(person) ));


        //Filter
        List<Person> femaleList = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
//      femaleList.forEach(person -> System.out.println(person));
        //Sort
        List<Person> sortedlist = people.stream().
                sorted(Comparator.comparing(Person::getAge)).
                collect(Collectors.toList());

//        sortedlist.forEach(person -> System.out.println(person));


    }


    private static List<Person> getPeople(){
        return List.of(
                new Person("Leticia",20,Gender.FEMALE),
                new Person("Catia",18,Gender.FEMALE),
                new Person("Karen",23,Gender.FEMALE),
                new Person("Albert",21,Gender.MALE),
                new Person("Luis",19,Gender.MALE),
                new Person("Melven",26,Gender.MALE),
                new Person("Keyze",28,Gender.MALE),
                new Person("Jhon",30,Gender.MALE)

        );
    }


}
