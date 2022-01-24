import java.io.*;

public class Example_15_31_externalizable_Person implements Externalizable {


  public static void main(String[] args) {

    try {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("externalizable.txt"));
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("externalizable.txt"));
      oos.writeObject(new Example_15_31_externalizable_Person("neno",20));
      Example_15_31_externalizable_Person p = (Example_15_31_externalizable_Person)ois.readObject();
      System.out.println(p);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }

  }

  /**
   * 另一种自定义序列化机制
   */
  private String name;
  private transient int age;

  // 书中写了"注意此处没有提供无参数的构造器",
  // 但是不写无参构造会报"InvalidClassException"错,原因是:该类没有可访问的无参数构造函数
  public Example_15_31_externalizable_Person() {
  }

  public Example_15_31_externalizable_Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public void writeExternal(java.io.ObjectOutput oo) throws IOException {
    oo.writeObject(new StringBuffer(name).reverse());
    oo.writeInt(age);
  }

  @Override
  public void readExternal(java.io.ObjectInput oi) throws IOException, ClassNotFoundException {
    this.name = ((StringBuffer) oi.readObject()).reverse().toString();
    this.age = oi.readInt();
  }

  @Override
  public String toString() {
    return "Example_15_31_externalizable_Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
