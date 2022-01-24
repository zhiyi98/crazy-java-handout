import java.io.*;

public class Example_15_30_resolve_Orientation implements Serializable {

  /**
   * Example_15_30_resolve_Orientation是一个枚举类
   */
  public static final Example_15_30_resolve_Orientation HORIZONTAL = new Example_15_30_resolve_Orientation(1);
  public static final Example_15_30_resolve_Orientation VERTICAL = new Example_15_30_resolve_Orientation(2);
  private int value;
  private Example_15_30_resolve_Orientation(int value){
    this.value = value;
  }
  // 通过Orientation类提供一个readReslove方法来解决反序列化过程中ori是一个新的Orientation对象,而不等于Orientation的任何枚举值
  private Object readResolve(){
    if(value==1){
      return HORIZONTAL;
    }
    if(value == 2){
      return VERTICAL;
    }
    return null;
  }

  public static void main(String[] args) {

    try {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("transient.txt"));
      oos.writeObject(Example_15_30_resolve_Orientation.HORIZONTAL);
      Example_15_30_resolve_Orientation ori = (Example_15_30_resolve_Orientation)ois.readObject();
      System.out.println(ori);
      System.out.println(Example_15_30_resolve_Orientation.HORIZONTAL);
      System.out.println("--------------");
      System.out.println(ori==Example_15_30_resolve_Orientation.HORIZONTAL);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }

  }

}
