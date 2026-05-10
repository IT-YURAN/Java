import java.util.*;

public class Main {

    public static void main(String[] args) {

        Collection<String> stringCollection=new ArrayList<>();

        List<Integer> integerList=new ArrayList<>(); //Arraylist implementation

        integerList.add(3);
        integerList.add(2);
        integerList.add(33);
        integerList.add(35);

        for (Integer number: integerList){
            System.out.println(number);
        }

        Set<Integer> integerSet =new HashSet<>(); // HashSet implementation

        integerSet.add(4);
        integerSet.add(3);
        integerSet.add(9);
        integerSet.addAll(integerList);
        System.out.println(integerSet);


    }
}
