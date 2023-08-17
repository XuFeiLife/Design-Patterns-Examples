
/**
 * @description GIF图片阅读器工厂
 */
public class GifImageReaderFactory implements ImageReaderFactory {

  @Override
  public ImageReader createImageReader() {
    return new GifImageReader();
  }
}