// 使用对象流实现序列化
public class Example_15_18_Person implements java.io.Serializable {
  private String name;
  private int age;


  @Override
  public String toString() {
    return "Example_15_18_Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public Example_15_18_Person() {
  }

  public Example_15_18_Person(String name, int age) {
    this.name = name;
    this.age = age;
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
