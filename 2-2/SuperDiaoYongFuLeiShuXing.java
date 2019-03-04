class Person {
    public String info = "父类";
}
class Student extends Person {
    public String info = "子类";
    public void fun() {
        System.out.println(super.info);
        System.out.println(this.info);
    }
}
public class SuperDiaoYongFuLeiShuXing {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.fun();
    }
}