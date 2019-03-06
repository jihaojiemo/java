class Person {
    public void print() {
        System.out.println("父类");
    }
}
class Student extends Person {
    public void print() {
        System.out.println("子类");
    }
    public void fun() {
        System.out.println("只有子类有");
    }
}
public class XiangXiaZhuanXing {
    public static void main(String[] args) {
        Person per = new Person();
        if(!(per instanceof Student)) {
            per = new Student();
        }
        Student stu = (Student) per;
        stu.fun();
    }
}