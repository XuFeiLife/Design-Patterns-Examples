package simplefactory;

/**
 * @description 工厂类
 */
class ShapeFactory {
    static Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            throw new UnSupportedShapeException("Unsupported shape: " + shapeType);
        }
    }
}