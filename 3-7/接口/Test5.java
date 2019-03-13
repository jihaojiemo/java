//定义一个USB标准
interface USB {
    //安装USB驱动
    void setUp();
    //工作
    void work();
}
//定义一个电脑类假设只能插USB设备
class Computer {
    public void plugIn(USB usb) {
        usb.setUp();
        usb.work();
    }
}
//定义一个U盘设备
class UDisk implements USB {
    public void setUp() {
        System.out.println("安装U盘驱动");
    }
    public void work() {
        System.out.println("U盘正常工作");
    }
}
//定义一个打印机设备
class PrintDisk implements USB {
    public void setUp() {
        System.out.println("安装打印机驱动");
    }
    public void work() {
        System.out.println("打印机正常工作");
    }
}
public class Test5 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.plugIn(new UDisk());
        System.out.println("----------");
        computer.plugIn(new PrintDisk());
    }
}