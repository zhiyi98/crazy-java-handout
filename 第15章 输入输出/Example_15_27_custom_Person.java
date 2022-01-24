import java.io.IOException;

public class Example_15_27_custom_Person implements java.io.Serializable {

  private String name;
  private int age;


  public Example_15_27_custom_Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  private void writeObject(java.io.ObjectOutputStream oos) throws IOException {
    oos.writeObject(new StringBuffer(name).reverse());
    oos.writeInt(age);
  }

  private void readObject(java.io.ObjectInputStream ois) throws IOException, ClassNotFoundException {
    this.name = ((StringBuffer) ois.readObject()).reverse().toString();
    this.age = ois.readInt();
  }

  @Override
  public String toString() {
    return "Example_15_27_custom_Person{" +
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
