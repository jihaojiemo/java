class Person {
    public void print() {
        System.out.println("父类");
    }
}
class Student extends Person {
    public void print() {
        System.out.println("子类");
    }
}
public class XiangShangZhuanXing {
    public static void main(String[] args) {
        Person per = new Student();
        per.print();
    }
}