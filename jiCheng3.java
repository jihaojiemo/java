class Person {
    public Person() {
        System.out.println("1.Person类的对象产生");
    }
}
class Student extends Person {
    public Student() {
        System.out.println("2.Student类的对象产生");
    }
}
public class JiCheng3 {
    public static void main(String[] args) {
        new Student();
    }
}