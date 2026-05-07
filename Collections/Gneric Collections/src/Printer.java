// We use < > to specify parameter type
public class Printer <T>{ // Generic classes can operate on object of different types

    private  T obj;

    public Printer(T obj) {
        this.obj = obj;
    }

  public  void print(){
      System.out.println(obj);
  }

  // A Generic Method
  public static <T> void printall(T element){
      System.out.println(element.getClass().getName()+ " = "+ element);
  }
}
