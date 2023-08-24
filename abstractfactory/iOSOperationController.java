
/**
 * @description 具体产品类： 实现抽象产品接口，提供具体的操作控制器和界面控制器实现。
 * 例如，有AndroidOperationController、iOSOperationController、
 * AndroidInterfaceController和iOSInterfaceController等具体产品类。
 * @date
 */
public class iOSOperationController implements OperationController {
    @Override
    public void control() {
        System.out.println("iOS Operation Controller");
    }
}