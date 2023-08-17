package factorymethod;
/**
 * @description JPG图片阅读器
 */
public class JpgImageReader implements ImageReader {

  @Override
  public void readImage(String filename) {
    System.out.println("Reading JPG image: " + filename);
  }
}