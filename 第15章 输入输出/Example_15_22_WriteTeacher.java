import java.io.*;

public class Example_15_22_WriteTeacher {


  public static void main(String[] args) {

    try {
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("teacher.txt")));
      Example_15_18_Person per = new Example_15_18_Person("孙悟空", 500);
      Example_15_21_Teacher t1 = new Example_15_21_Teacher("唐僧", per);
      Example_15_21_Teacher t2 = new Example_15_21_Teacher("菩提祖师", per);
      oos.writeObject(t1);
      oos.writeObject(t2);
      oos.writeObject(per);
      oos.writeObject(t2);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
