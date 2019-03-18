abstract class Role {
    private String name;
    private int age;
    private String sex;
    public Roly(String name, int age) {
        //this表示当前属性
        this.name = name;
        this.age = age;
    }
    public Roly(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //抽象方法
    public abstract void play();
}
class Employee extends Roly {
    private int salary;
    //静态成员变量
    private static String ID;
    public void play() {
        System.out.println("姓名是："+super.name+"年龄是："+super.age+"性别是："+super.sex);
    }
    private final void sing() {
        
    }
}
class Manager extends Employee {
    private final String vehicle;
}
public class Test5 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
    }
}