import java.io.*;
import java.util.ArrayList;

public class Example_15_29_replace_ReplaceTest {
  public static void main(String[] args) {


    try {
      Example_15_28_replace_Person per = new Example_15_28_replace_Person("孙悟空",500);
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("replace.txt"));
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("replace.txt"));
      oos.writeObject(per);
      // Java 的序列化机制保证在序列化某个对象之前,先调用对象writeReplace方法,如果该方法返回另一个Java对象,则系统
      // 转换为序列化另一个对象
      ArrayList list = (ArrayList) ois.readObject();
//      Object list = ois.readObject();
      System.out.println(list);


    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}
