package simplefactory;

/**
 * @description 正方形类
 */
public class Square extends Shape {

  @Override
  void draw() {
    System.out.println("Drawing a Square");
  }

  @Override
  void erase() {
    System.out.println("Erasing a Square");
  }
}