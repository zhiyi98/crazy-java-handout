import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example_15_23_ReadTeacher {

  public static void main(String[] args) {
    try {
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("teacher.txt"));
      Example_15_21_Teacher t1 = (Example_15_21_Teacher)ois.readObject();
      Example_15_21_Teacher t2 = (Example_15_21_Teacher) ois.readObject();
      Example_15_18_Person p = (Example_15_18_Person) ois.readObject();
      Example_15_21_Teacher t3 = (Example_15_21_Teacher) ois.readObject();


      System.out.println(t1.getStudent());
      System.out.println(t2.getStudent());
      System.out.println(p.getName() + "," + p.getAge());
      System.out.println(t3.getStudent());
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}
