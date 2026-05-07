public class Main {

    public static void main(String[] args) {

        //Instance of String Type
        Printer<String> printer=new Printer<>("Hello");
        printer.print();

        //Instance of Integer Type
        Printer<Integer> integerPrinter=new Printer<>(50);
        integerPrinter.print();
        //Instance of Double Type
        Printer<Double> DoublePrinter=new Printer<>(3.14);
        DoublePrinter.print();

        Printer.printall(70);
        Printer.printall("World");
        Printer.printall(40.5);
    }
}
