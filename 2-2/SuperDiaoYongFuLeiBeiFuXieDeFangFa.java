class Person {
    public void print() {
        System.out.println("父类");
    }
}
class Student extends Person {
    public void print() {
        super.print();
        System.out.println("子类");
    }
}
public class SuperDiaoYongFuLeiBeiFuXieDeFangFa {
    public static void main(String[] args) {
        new Student().print();
    }
}