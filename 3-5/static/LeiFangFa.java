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

    public void getPersonInfo() {
        System.out.println("国籍是："+country+", 姓名是："+name+", 年龄是："+age);
    }
}

public class LeiFangFa {
    public static void main(String[] args) {
        Person.setCountry("中国");
        Person per = new Person("张三", 20);
        per.getPersonInfo();
    }
}