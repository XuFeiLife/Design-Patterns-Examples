package simplefactory;

/**
 * @description 圆形类
 */
public class Circle extends Shape {

  @Override
  void draw() {
    System.out.println("Drawing a Circle");
  }

  @Override
  void erase() {
    System.out.println("Erasing a Circle");
  }
}