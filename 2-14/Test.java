class Outter {
    //外部类的私有属性
    private String outName;
    private int outAge;
    
    class Inner {
        //内部类的私有属性
        private String innerName;
        private int innerAge;
        
        //内部类的构造方法，为outName和outAge进行初始化操作并赋值
        public Inner() {
            outName = "张三";
            outAge = 18;
        }

        //内部类的普通方法
        public void print() {
            System.out.println("姓名是："+outName);
            System.out.println("年龄是："+outAge);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Outter.Inner in = new Outter().new Inner();
        in.print();
    }
}
