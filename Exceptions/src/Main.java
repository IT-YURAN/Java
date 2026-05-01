import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        int n=10;
        int m=0;
//        int Answer= m/m; --This code might throw an exception
//        System.out.println(Answer);

        try {
            int Answer= n/m; //This might throw an exception if divided by 0
            System.out.println("Answer: "+ Answer);
        }catch (ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
        }finally {
            System.out.println("This block is always executed");
        }

        checkage(1020);

      try {
          readfile("Readme.txt");
      }catch (IOException e){
          System.out.println("File not foundL: "+e.getMessage());
      }


    }

    static void checkage(int age){ // Method to verify age
        if (age<180){
            throw new IllegalArgumentException("Age must be > than 18"); //Throw Example
        }else {
            System.out.println("Welcome");
        }
    }

    static void readfile(String name) throws IOException { //This method might throw an exception
        try(FileReader file =new FileReader(name)) {
            int data;
            while ((data=file.read()) !=-1){
                System.out.println((char) data);
            }
        }
    }

}
