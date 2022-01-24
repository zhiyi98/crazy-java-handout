import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Example_7_1_TestCollection {
  public static void main(String[] args) {

    /**
     * Collection集合
     */

    // ---------------------------------List集合---------------------------------
    Collection c = new ArrayList();
    c.add("孙悟空");
    c.add("孙悟空");
    c.add(6);
    System.out.println("c集合里的元素个数为:" + c.size());
    c.remove(6);// 删除指定元素
    System.out.println("c集合中是否包含'孙悟空'字符串:" + c.contains("孙悟空"));
    c.add("猪八戒");
    System.out.println("c集合中的元素" + c);
    System.out.println("-------------------");
    // ---------------------------------Set集合---------------------------------
    Collection person = new HashSet();
    person.add("猪八戒");
    person.add("嫦娥妹妹");
    System.out.println("c集合是否完全包含person集合:" + c.containsAll(person));
    c.removeAll(person);
    System.out.println("c集合的元素:" + c);
    c.clear();
    System.out.println("c集合中的元素:" + c);
    person.retainAll(c);
    System.out.println("person集合的元素:" + person);


  }

}
