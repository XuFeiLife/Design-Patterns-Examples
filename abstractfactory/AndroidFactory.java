/**
 * @author xu fei
 * @description 具体工厂类（具体的手机平台工厂）： 实现抽象工厂接口，负责创建具体的操作控制器和界面控制器对象。
 * 例如，有一个AndroidFactory类和一个iOSFactory类，分别负责创建Android和iOS平台下的控制器。
 * @date
 */
public class AndroidFactory implements AbstractFactory {

    @Override
    public OperationController createOperationController() {
        return new AndroidOperationController();
    }


    @Override
    public InterfaceController createInterfaceController() {
        return new AndroidInterfaceController();
    }
}