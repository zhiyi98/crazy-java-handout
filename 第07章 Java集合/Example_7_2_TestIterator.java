import java.util.HashSet;
import java.util.Iterator;

public class Example_7_2_TestIterator {
  public static void main(String[] args) {

    /**
     * 通过Iterator来遍历集合的元素
     */
    HashSet person = new HashSet();
    person.add("猪八戒");
    person.add("高翠兰");
    person.add("嫦娥妹妹");
    // --------------------获取Person集合对应的迭代器--------------------
    Iterator iterator = person.iterator();
    while(iterator.hasNext()){
      String s = (String) iterator.next();
      System.out.println(s);
      if(s.equals("高翠兰")){
        iterator.remove();
      }
      s = "测试字符串";// 对person变量赋值,不会改变集合元素本身
    }
    System.out.println(person);


  }

}
