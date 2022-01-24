public class Example_15_21_Teacher implements java.io.Serializable {

  // --------------------------------对象引用的序列化-------------------------------
  // 为什么需要序列化？
  // 因为如果某个类的属性类型是引用类型，那么引用类不许是可序列化的，否则此属性类是不可序列化的。
  // ---------------------------------下面代码演示---------------------------------
  private String name;
  private Example_15_18_Person student;

  public Example_15_21_Teacher(String name, Example_15_18_Person student) {
    this.name = name;
    this.student = student;
  }

  @Override
  public String toString() {
    return "Example_15_21_Teacher{" +
        "name='" + name + '\'' +
        ", student=" + student +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Example_15_18_Person getStudent() {
    return student;
  }

  public void setStudent(Example_15_18_Person student) {
    this.student = student;
  }
}