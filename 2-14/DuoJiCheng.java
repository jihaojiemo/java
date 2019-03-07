class A {
    //A类的私有属性name
    private String name = "张三";
    //name的getter方法
    //父类私有域可以被继承但不可直接使用,需通过getter方法间接获得私有域的内容
    public String getName() {
        return this.name;
    }
}
class B {
    //B类的私有属性age
    private int age = 18;
    //age的getter方法
    public int getAge() {
        return this.age;
    }
}
class Outter {
    //内部类InnerD继承了A类
    class InnerD extends A {
        public void printName() {
            System.out.println("姓名是："+super.getName());
        }
    }
    //又一个内部类InnerE继承了B类
    class InnerE extends B {
        public void printAge() {
            System.out.println("年龄是："+super.getAge());
        }
    }
    //产生内部类InnerD和InnerE的对象并调用自身普通方法
    public void print() {
        new InnerD().printName();
        new InnerE().printAge();
    }
}
public class DuoJiCheng {
    public static void main(String[] args) {
        Outter out = new Outter();
        out.print();
    }
}