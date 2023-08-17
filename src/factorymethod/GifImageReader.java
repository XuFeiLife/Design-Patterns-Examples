package factorymethod;

/**
 * @description GIF图片阅读器
 */
public class GifImageReader implements ImageReader {

  @Override
  public void readImage(String filename) {
    System.out.println("Reading GIF image: " + filename);
  }
}