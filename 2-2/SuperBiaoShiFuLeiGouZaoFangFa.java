class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("姓名是："+name+", 年龄是："+age);
    }
}
class Student extends Person {
    private String school;
    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
        System.out.println("学校是："+school);
    }
}
public class SuperBiaoShiFuLeiGouZaoFangFa {
    public static void main(String[] args) {
        new Student("张三", 20, "清华");
    }
}