class Person {
    static String country = "中国";
    String name;
    int age;

    public void getPersonInfo() {
        System.out.println("国籍是："+country+", 姓名是："+name+", 年龄是："+age);
    }
}

public class LeiShuXing {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "张三";
        p1.age = 18;
        Person p2 = new Person();
        p2.name = "李四";
        p2.age = 20;
        Person.country = "中华民国";
        p1.getPersonInfo();
        p2.getPersonInfo();
    }
}