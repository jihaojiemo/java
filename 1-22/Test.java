public class Test {
    {
        System.out.println("1.Test类的构造块");
    }
    public Test() {
        System.out.println("2.Test类的构造方法");
    }
    // 主类中的静态块
    static {
        System.out.println("3.Test类的静态块");
    }
    public static void main(String[] args) {
        System.out.println("===============");
        new Test();
        new Test();
        System.out.println("===============");
    }
}