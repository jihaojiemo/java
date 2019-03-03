class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void getPersonInfo() {
        System.out.println("姓名是："+name+", 年龄是："+age);
    }
}
public class ThisBiaoShiBenLeiShuXing {
    public static void main(String[] args) {
        Person per = new Person("张三", 18);
        per.getPersonInfo();
    }
}