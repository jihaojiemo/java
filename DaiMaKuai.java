class Test {
    public Test() {
        System.out.println("1.Test的构造方法");
    }
    {
        System.out.println("2.Test的构造块");
    }
    static{
        System.out.println("3.Test的静态块");
    }
}
public class DaiMaKuai extends Test {
    public DaiMaKuai() {
        System.out.println("4.DaiMaKuai的构造方法");
    }
    {
        System.out.println("5.DaiMaKuai的构造块");
    }
    static{
        System.out.println("6.DaiMaKuai的静态块");
    }
    public static void main(String[] args) {
        System.out.println("7.main方法开始");
        new DaiMaKuai();
        new DaiMaKuai();
        System.out.println("8.main方法结束");
    }
}