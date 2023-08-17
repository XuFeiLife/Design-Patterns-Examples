/**
 * @description 自定义异常类
 */
public class UnSupportedShapeException extends RuntimeException {

  UnSupportedShapeException(String message) {
    super(message);
  }
}