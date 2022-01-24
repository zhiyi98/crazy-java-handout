import java.io.*;

public class Example_15_24_SerializeMutable {

  public static void main(String[] args) {

    Example_15_18_Person per = new Example_15_18_Person("孙悟空",500);

    try {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("mutable.txt"));
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("mutable.txt"));
      oos.writeObject(per);
      // ---------------------------------将Person的对象的name属性改变，第二此写入-----------------------------
      per.setName("猪八戒");
      System.out.println(per);
      System.out.println("-------------");
      oos.writeObject(per);
      // -----------------------------------------读取两次写入的内容-----------------------------------------
      Example_15_18_Person p1 = (Example_15_18_Person)ois.readObject();
      Example_15_18_Person p2 = (Example_15_18_Person)ois.readObject();
      // ---------------------------------------------输出结果---------------------------------------------
      System.out.println(p1);
      System.out.println(p2);
      System.out.println("-------------");
      System.out.println(p1== p2);
      System.out.println(p1.equals(p2));

      // ------------------------------------------Java序列化机制------------------------------------------
      // - 只有当第一次调用writeObject方法来输出对象时才会将对象转换成为字节序列，并写入到ObjectOutputStream，
      // 后面过程序中如果该对象的属性发生了改变，即再次调用writeObject方法输出该对象时，改变后的属性不会被输出
      //
      // - 所有保存到磁盘中的对象都有一个序列化编号。
      // - 当程序试图序列化一个对象时，程序会先检查该对象是否被序列化过，只有当该对象从未被序列化过，系统才会将该对象转换成
//    // 字节序列并输出。
      // - 如果某个对象是已经序列化过的，程序将直接只是输出一个序列化编号，而不是再次重新序列化该对象。

    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }


  }

}
