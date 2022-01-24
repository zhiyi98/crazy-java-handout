import java.io.Serializable;

public class Example_15_25_transient_Person implements Serializable {

    /**
     * 自定义序列化
     */
  private String name;
  private transient int age;// transient 关键字只能用于修饰属性

  @Override
  public String toString() {
    return "Example_15_25_transient_Person{" +
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

  public Example_15_25_transient_Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
