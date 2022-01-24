import java.io.*;
import java.util.ArrayList;

public class Example_15_28_replace_Person implements java.io.Serializable{

  private String name;
  private int age;

  public Example_15_28_replace_Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // 此writeReplace方法由序列化机制调用，前提是如果此方法存在。
  // 下面Person类提供了writeReplace方法，这样就可以在写入Person对象时将该对象替换成ArrayList
  private Object writeReplace(){
    ArrayList<Object> list = new ArrayList<Object>();
    list.add(name);
    list.add(age);
    return list;
  }

  @Override
  public String toString() {
    return "Example_15_28_replace_Person{" +
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
