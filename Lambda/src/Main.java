import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers =new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("All Elements");
        numbers.forEach((n)-> System.out.println(n)); //Simple expression

        System.out.println("Even elements");
        numbers.forEach((n)->{ //Complex work
            if (n%2==0){
                System.out.println(n);
            }
                });

        int a= 5;
        Square s= (number -> number*number);

        int ans=s.calculate(a);
        System.out.println("Ans : "+ a);
    }


}
