package factorymethod;

/**
 * @description GIF图片阅读器工厂
 */
public class JpgImageReaderFactory implements ImageReaderFactory {

  @Override
  public ImageReader createImageReader() {
    return new JpgImageReader();
  }
}