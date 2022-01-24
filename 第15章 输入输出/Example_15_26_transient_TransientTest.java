import java.io.*;

public class Example_15_26_transient_TransientTest {

  public static void main(String[] args) {
    /**
     * 自定义序列化
     */

    // ---------------------------------------创建对象的输入，输出流---------------------------------------
    try {
      Example_15_25_transient_Person per = new Example_15_25_transient_Person("孙悟空", 500);
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("transient.txt"));
      // --------------------------------------写入、读取Person对象--------------------------------------
      oos.writeObject(per);
      Example_15_25_transient_Person p = (Example_15_25_transient_Person) ois.readObject();
      System.out.println(p);

      // Person 的age属性并没有被改变,原因是因为在Person类中的age属性使用transient关键字修饰，所以per输出的age属性为0；
      // 自定义序列化有什么用？
      // 在一些特殊场景下，如果某个类里包含的属性值是敏感信息，例如银行账户信息等，这个时候就不希望系统将该属性值进行序列化；


    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }


  }

}
