import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        int[] arr=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;

//        int []arr={1,2,3,}; <- Can be created like this

        //Printing first element of Array
        System.out.println(arr[0]);

        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        //Printing first element of ArrayList
        System.out.println(al.getFirst());

        System.out.println(Arrays.toString(arr));
        System.out.println(al);

        //Is allowed
        Main[] Marr=new Main[1];

//        ArrayList<char> Objectlist=new ArrayList<>(); <- Not allowed

        ArrayList<String> stringlis=new ArrayList<>();
        ArrayList<Double> Doublelist=new ArrayList<>();
        ArrayList<Objects> Objectlist=new ArrayList<>();

        System.out.println("Compiled and executed successfully");

    }
}
