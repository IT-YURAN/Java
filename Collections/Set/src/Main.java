import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>(); // Does not guarantee any order

        stringSet.add("Java");
        stringSet.add("C++");
        stringSet.add("C#");
        stringSet.add("Python");
        System.out.println(stringSet);

        Set<String> LinkedstringSet = new LinkedHashSet<>(); // Does  guarantee order

        LinkedstringSet.add("Java");
        LinkedstringSet.add("C++");
        LinkedstringSet.add("C#");
        LinkedstringSet.add("Python");


        System.out.println(LinkedstringSet);

        System.out.println(LinkedstringSet.containsAll(stringSet));

        String[] arr={
                "Go","Ruby", "Assembly"
        };
        LinkedstringSet.addAll(List.of(arr));
        System.out.println(LinkedstringSet);
        System.out.println(LinkedstringSet.containsAll(List.of(arr)));
        System.out.println(  List.of(arr).containsAll(LinkedstringSet));
    }
}
