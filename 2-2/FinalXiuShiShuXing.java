class A {
    public static final int MAX_GRADE = 100;
    public A() {
        MAX_GRADE = 120;
    }
}
public class FinalXiuShiShuXing {
    public static void main(String[] args) {
        System.out.println(new A().MAX_GRADE);
    }
}