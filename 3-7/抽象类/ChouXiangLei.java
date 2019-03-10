abstract class Person {
    private String name;
    public void setName() {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    //抽象方法
    public abstract void getPersonInfo();
}
//子类继承了父类，并覆写了父类的抽象方法
class Student extends Person {
    public void getPersonInfo() {
        System.out.println("我是个学生！");
    }
}
public class ChouXiangLei {
    public static void main(String[] args) {
        //向上转型
        Person per = new Student();
        per.getPersonInfo();
    }
}
