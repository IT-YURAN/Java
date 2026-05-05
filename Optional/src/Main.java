import java.util.Optional;

public class Main {

    public static void main(String[] args) {

//        String name=null;
//        System.out.println(name.toLowerCase());  <- This can throe an NullPointerException because we are trying to invoke String.toLowerCase() on a null value

        Optional<String> optionalString=Optional.ofNullable("Hello");

        System.out.println(optionalString.isEmpty());
        System.out.println(optionalString.orElse("World"));
        System.out.println(optionalString.isPresent());

    }
}
