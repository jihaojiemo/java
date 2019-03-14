class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean equals(Object obj) {
        //判断地址是否相等
        if(obj == this) {
            return true;
        }
        //传进来的对象不是Person对象
        if(!(obj instanceof Person)) {
            return false;
        }
        Person per = (Person) obj;
        return this.age == per.age && this.name.equals(per.name);
    }
}
public class Test {
    public static void main(String[] args) {
        Person per1 = new Person("张三", 20);
        Person per2 = new Person("张三", 20);
        Person per3 = new Person("张三", 21);
        System.out.println(per1.equals(per2));
        System.out.println(per1.equals(per3));
    }
}