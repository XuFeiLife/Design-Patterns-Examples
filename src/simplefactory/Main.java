package simplefactory;

/**
 * 使用简单工厂模式设计一个可以创建不同几何形状（如圆形、方形和三角形等）的绘图工具 每个几何图形都具有绘制draw（）和擦除erase（）两个方法
 * 要求在绘制不支持的几何图形时，提示一个UnSupportedShapeException。
 */
public class Main {

  public static void main(String[] args) {
    try {
      Shape circle = ShapeFactory.createShape("circle");
      circle.draw();
      circle.erase();

      Shape square = ShapeFactory.createShape("square");
      square.draw();
      square.erase();

      Shape triangle = ShapeFactory.createShape("triangle");
      triangle.draw();
      triangle.erase();

      // 尝试创建不支持的几何形状
      Shape unsupported = ShapeFactory.createShape("rectangle");
      unsupported.draw();
    } catch (UnSupportedShapeException e) {
      System.out.println(e.getMessage());
    }
  }

}