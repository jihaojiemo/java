class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.fun();
        this.name = name;
        this.age = age;
    }
    public void getPersonInfo() {
        System.out.println("姓名是："+name+", 年龄是："+age);
    }
    public void fun() {
        System.out.println("产生一个Person对象");
    }
}
public class ThisBiaoShiBenLeiFangFa {
    public static void main(String[] args) {
        Person per = new Person("张三", 20);
        per.getPersonInfo();
    }
}