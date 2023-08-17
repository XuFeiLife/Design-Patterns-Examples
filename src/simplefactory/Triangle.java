package simplefactory;

/**
 * @description 三角形类
 */
public class Triangle extends Shape {

  @Override
  void draw() {
    System.out.println("Drawing a Triangle");
  }

  @Override
  void erase() {
    System.out.println("Erasing a Triangle");
  }
}