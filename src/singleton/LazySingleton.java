package singleton;

/**
 * 单例模式-懒汉式
 */
public class LazySingleton {

  // instance 需要使用volatile修饰
  private static volatile LazySingleton instance = null;

  private LazySingleton() {

  }

  /**
   * @description 多线程环境下使用DCL
   */
  public static LazySingleton getInstance() {
    if (instance == null) {
      synchronized (LazySingleton.class) {
        if (instance == null) {
          instance = new LazySingleton();
        }

      }
    }
    return instance;
  }

}