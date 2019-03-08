class Outer {
    private String a = "Hello World!";
    //成员内部类
    class Inner {
        public void print() {
            System.out.println(a);
        }
    }
    public void fun() {
        Inner in = new Inner();
        in.print();
    }
}
public class ChengYuanNeiBuLei {
    public static void main(String[] args) {
    	//在外部类外部创建成员内部类对象
        Outer.Inner in = new Outer().new Inner();
        in.print();
    }
}