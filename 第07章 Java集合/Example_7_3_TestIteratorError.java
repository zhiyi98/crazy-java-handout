import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Example_7_3_TestIteratorError {
  public static void main(String[] args) {

    Collection person = new HashSet();
    person.add("孙悟空");
    person.add("贝吉塔");
    person.add("弗利沙");
    Iterator iterator = person.iterator();
    while(iterator.hasNext()){
      String s = (String)iterator.next();
      System.out.println(s);
      if(s.equals("弗利沙")){
        person.remove(s);
      }
    }

    System.out.println(person);


  }

}
