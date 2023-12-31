
/**
 * @description 使用工厂方法模式设计一个程序来读取各种不同类型的图片格式，针对每种图片格式都设计一个图片读取器。
 * 例如，GIF图片读取器用于读取GIF格式的图片，JPG图片读取器用于读取JPG格式的图片。需充分考虑系统的灵活性和可扩展性。
 */
public class FactoryMethodMain {

  public static void main(String[] args) {
    ImageReaderFactory gifFactory = new GifImageReaderFactory();
    ImageReader gifReader = gifFactory.createImageReader();
    gifReader.readImage("example.gif");

    ImageReaderFactory jpgFactory = new JpgImageReaderFactory();
    ImageReader jpgReader = jpgFactory.createImageReader();
    jpgReader.readImage("example.jpg");
  }

}