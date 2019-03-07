class Outter {
    class Inner {
        public void print() {
            System.out.println("外部类和内部类");
        }
    }
    public void print() {
        //外部类访问内部类元素，需要通过内部类引用(对象)来访问
        Inner in = new Inner();
        in.print();
    }
}
public class Test2 {
    public static void main(String[] args) {
        Outter out = new Outter();
        out.print();
    }
}