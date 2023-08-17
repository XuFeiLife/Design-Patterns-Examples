package singleton;

/**
 * 测试
 */
public class Main {

  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();
    Singleton singleton3 = Singleton.getInstance();

    //输出结果都是一样的
    System.out.println(singleton1);
    System.out.println(singleton2);
    System.out.println(singleton3);
  }

}