
/**
 * @单例模式-恶汉式
 */
public class EagerSingleton {

  private static final EagerSingleton instance = new EagerSingleton();

  private EagerSingleton() {

  }

  public static EagerSingleton getInstance() {
    return instance;
  }


}