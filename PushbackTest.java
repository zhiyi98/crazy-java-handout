public class PushbackTest{
  public static void main(String[] args) {
    System.out.println(1);
    System.out.println(1);
    System.out.println(1);
    PushbackReader pr = new PushbackReader(new FileReader("test.java"), 64);
    System.out.println(1);
    System.out.println(2);
    System.out.println(2);
    System.out.println(2);
    System.out.println(2);
    System.out.println(2);
    System.out.println(2);
    System.out.println(2);
  }
}