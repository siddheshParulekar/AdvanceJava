package comparable;

public class MyClass {
private static int x = 10;
static {
      x++;
      System.out.println("X:"+x);
}
static {
      ++x;
      System.out.println("X:"+x);
}
{
      x--;
      System.out.println("X:"+x);
}
public static void main(String[] args) {
    MyClass obj = new MyClass();
    MyClass obj2 = new MyClass();
    MyClass obj3 = new MyClass();
    System.out.println(x);
  }
}