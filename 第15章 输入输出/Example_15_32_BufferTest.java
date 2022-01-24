import java.nio.CharBuffer;

public class Example_15_32_BufferTest {

  public static void main(String[] args) {

    CharBuffer buff = CharBuffer.allocate(8);//分配一个新的字符缓冲区
    System.out.println("capacity:"+buff.capacity());//返回此缓冲区的容量
    System.out.println("limit:"+buff.limit());//返回此缓冲区的限制。
    System.out.println("position:"+buff.position());//返回此缓冲区的位置。

    // 放入元素
    buff.put("a");
    buff.put("b");
    buff.put("c");
    System.out.println("-----------------");
    System.out.println("加入三个元素后,position = " + buff.position());
    buff.flip();//翻转此缓冲区
    System.out.println("执行flip后,limit = " + buff.limit());
    System.out.println("第一个元素(position=0):" + buff.get());
    System.out.println("position = " + buff.position());
    System.out.println("-----------------");
    // 调用clear方法
    System.out.println("执行clear()后,limit = " + buff.limit());
    System.out.println("执行clear()后,position = " + buff.position());
    System.out.println("执行clear()后,缓冲区内容并没有被清除:" + buff.get(2));
    System.out.println("执行绝对读取后:" + buff.position());
    System.out.println("-----------------");
    System.out.println(buff);




  }

}
