import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer,String> Ma =new HashMap<>();

        Ma.put(1,"Java");
        Ma.put(2,"C#");
        Ma.put(3,"C++");
        Ma.put(4,"JavaScrip");

      for (Map.Entry mapelemts: Ma.entrySet() ){

          int key = (int)mapelemts.getKey();

          String value=(String) mapelemts.getValue();

          System.out.println(key + ":" + value);
      }

    }
}
