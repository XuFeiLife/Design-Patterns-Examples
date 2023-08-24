
/**
 * @author xu fei
 * @description 定义创建操作控制器和界面控制器的抽象方法
 * @date
 */
interface AbstractFactory {
    OperationController createOperationController();
    InterfaceController createInterfaceController();
}