//抽象类
abstract class Person {
    public abstract void print();
    //在抽象类内部提供了一个实现好的子类
    public static Person getInstance() {
        //匿名内部类，等同于 class 无名 extends Person
        return new Person() {
            public void print() {}
        };
    }
}
public class NiMingNeiBuLei {
    public static void main(String[] args) {
        Person per = Person.getInstance();
        per.print();
    }
}