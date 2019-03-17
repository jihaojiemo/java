//int数据类型的包装类
class IntDemo {
    private int num;
    public IntDemo(int num) {
        this.num = num;
    }
    //利用IntValue就可以实现基本数据类型变为对象的需求
    public int intValue() {
        return this.num;
    }
}
public class Test {
    public static void main(String[] args) {
        //向上转型，Object类接接收了int型
        Object obj = new IntDemo(20);
        //向下转型
        IntDemo temp = (IntDemo) obj;
        //取出里面的基本数据类型操作
        System.out.println(temp.intValue());
    }
}