class Person {
    private String name;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
class Student extends Person {
}
public class JiCheng {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(20);
        System.out.println("姓名是："+stu.getName()+", 年龄是："+stu.getAge());
    }
}