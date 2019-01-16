class Person {
    private String name;
    private int age;
    public Person() {
        System.out.println("1.无参构造");
    }
    public Person(String name) {
        this.name = name;
        System.out.println("2.有参构造");
    }
    public Person(String name, int age) {
        this(name);
        this.age = age;
    }
    public void personGetInfo() {
        System.out.println("姓名是："+name+"，年龄是："+age);
    }
}

public class GouZaoFangFaChongZai {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.personGetInfo();
        Person p2 = new Person("张三");
        p2.personGetInfo();
        Person p3 = new Person("张三", 20);
        p3.personGetInfo();
    }
}