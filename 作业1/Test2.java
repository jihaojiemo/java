class Person {
    private static String country;
    private String name;
    private int age;
   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void setCountry(String c) {
        country = c;
    }

    public void personGetInfo() {
        System.out.println("国籍是："+country+", 姓名是："+name+", 年龄是："+age);
    } 
}

public class Test2 {
    public static void main(String[] args) {
        Person.setCountry("中国");
        Person per1 = new Person("张三", 20);
        per1.personGetInfo();
        Person per2 = new Person("李四", 18);
        per2.personGetInfo();
    }
}