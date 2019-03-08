class Outer {
    private static String a = "Hello world!";
    //静态内部类
    static class Inner {
        public void print() {
            System.out.println(a);
        }
    }
    public void fun() {
        Inner in = new Inner();
        in.print();
    }
}
public class JingTaiNeiBuLei {
    public static void main(String[] args) {
        //在外部类外部产生静态内部类对象
        Outer.Inner in = new Outer.Inner();
        in.print();
    }
}