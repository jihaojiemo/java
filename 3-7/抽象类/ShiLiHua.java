abstract class Person {
    //定义了一个构造方法，为了看怎样实例化对象的
    public Person() {
        System.out.println("父类");
    }
    //抽象方法
    public abstract void getPersonInfo();
}
class Student extends Person {
    //子类构造方法
    public Student() {
        System.out.println("子类");
    }
    //子类覆写过的方法
    public void getPersonInfo() {
        System.out.println("========");
    }
}
public class ShiLiHua {
    public static void main(String[] args) {
        Person per = new Student();
        per.getPersonInfo();
    }
}