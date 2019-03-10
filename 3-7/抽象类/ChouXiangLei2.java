abstract class Person {
    public abstract void getPersonInfo();
    //在抽象类内部提供了一个实现好的子类
    public static Person print() {
        //方法内部类
        class Student extends Person {
            public void getPersonInfo() {
                System.out.println("我是个学生！");
            }
        }
        return new Student();
    }
}
public class ChouXiangLei2 {
    public static void main(String[] args) {
        Person per = Person.print();
        per.getPersonInfo();
    }
}