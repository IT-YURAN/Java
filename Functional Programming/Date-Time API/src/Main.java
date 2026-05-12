import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        LocalDate localDate= LocalDate.now(); //Gets the date

        System.out.println(localDate);

        LocalDateTime localDateTime= LocalDateTime.now(); // Date and time
        System.out.println(localDateTime);

        LocalTime localTime=LocalTime.now(); //Get time
        System.out.println(localTime);


    }
}
