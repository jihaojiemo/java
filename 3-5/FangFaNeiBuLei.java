class Outer {
    private int num;
    public void fun(int data) {
        //方法内部类
        class Inner {
            public void print() {
                num++;
                System.out.println(num);
                System.out.println(data);
            }
        }
        new Inner().print();
    }
}
public class FangFaNeiBuLei {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.fun(20);
    }
}