class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Student extends Person {
    public void fun() {
        System.out.println(getName());
    }
}
public class JiCheng4 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        System.out.println(stu.getName());
        stu.fun();
    }
}